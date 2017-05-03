package com.anatoliy.practice.modul09;

import com.anatoliy.practice.modul07.task071.Currency;
import com.anatoliy.practice.modul07.task071.Order;
import com.anatoliy.practice.modul07.task071.User;
import com.sun.tools.javac.util.Convert;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = createOrder();
        System.out.println("отсортируйте список за ценой заказа по убыванию");
        orders.sort((t1, t2) -> t2.getPrice() - t1.getPrice());
        System.out.println(orders);
        System.out.println("отсортируйте список за ценой заказа по возрастанию и за городом пользователя");
        orders.sort(Comparator.comparingInt(Order::getPrice).thenComparing(Comparator.comparing(t -> t.getUser().getCity())));
        System.out.println(orders);
        System.out.println("отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя");
        orders.sort(Comparator.comparing(Order::getItemName).thenComparing(Comparator.comparing(Order::getId)).thenComparing(Comparator.comparing(t -> t.getUser().getCity())));
        System.out.println(orders);
        System.out.println("далите дублированные данные со списка");
        System.out.println(removeRepeatOrders(orders));
        //System.out.println("удалите объекты, где цена меньше 1500");                  // ПОДСКАЖИ КАК СДЕЛАТЬ ЧТОБ ПОСЛЕ ЭТОГО МЕТОДА НЕ УДАЛЯЛИСЬ ЭЛЕМЕНТЫ В ОСНОВНОМ СПИСКЕ?
        //System.out.println(removeWithPrice(orders, 1500));
        System.out.println("разделите список на 2 списка - заказы в долларах и в гривнах");
        printOrdersByCurrency(orders);
        System.out.println("разделите список на столько списков, сколько уникальных городов в User");
        printOrdersByCity(orders);
        System.out.println("проверьте, содержит ли сет заказ, где фамилия пользователя - “Burk”");
        checkSoname(orders, "Burk");
        System.out.println("удалите заказы в USD");
        System.out.println(removeOrdersByUSD(orders));


    }

    public static List createOrder() {
        List<Order> orderList = new ArrayList();
        orderList.add(new Order(200, Currency.UAH, "Toy", "Game", new User("Tolik", "Burk", "Kiev", 1400)));
        orderList.add(new Order(400, Currency.UAH, "Glass", "Brix", new User("Mark", "Stoul", "Lviv", 1100)));
        orderList.add(new Order(100, Currency.UAH, "Book", "Store", new User("Borka", "Koval", "Herson", 2000)));
        orderList.add(new Order(200, Currency.UAH, "Cloak", "Market", new User("Igor", "Koben", "Dnepr", 2100)));
        orderList.add(new Order(350, Currency.UAH, "Toy", "GameCountry", new User("Ivan", "Marks", "Odessa", 400)));
        orderList.add(new Order(200, Currency.UAH, "Mouse", "Zoo", new User("Alena", "Ivanov", "Lutsk", 2450)));
        orderList.add(new Order(400, Currency.UAH, "Cat", "Zoo", new User("Mila", "Polisuk", "Kovel", 4100)));
        orderList.add(new Order(1800, Currency.USD, "Phone", "Bootic", new User("Vera", "Gromov", "Vinnica", 200)));
        orderList.add(new Order(380, Currency.UAH, "Car", "Game", new User("Katya", "Bang", "Harkov", 40000)));
        orderList.add(new Order(550, Currency.USD, "Pens", "Build", new User("Lena", "Burk", "Harkov", 1200)));
        orderList.add(orderList.get(1));
        return orderList;
    }

    public static <T> List removeRepeatOrders(List<T> ordersNoSort) {
        List<T> uniqueOrdersList = ordersNoSort.stream().distinct().collect(Collectors.toList());
        return uniqueOrdersList;
    }

    public static <T extends Order> List removeWithPrice(List<T> allOrders, int price) {
        Predicate<T> pricePredicate = p -> p.getPrice() < price;
        allOrders.removeIf(pricePredicate);
        return allOrders;

    }

    public static <T extends Order> void printOrdersByCurrency(List<T> allOrders) {

        List<T> ordersByUSD = allOrders.stream().filter(t -> t.getCurrency().equals(Currency.USD)).collect(Collectors.toList());
        System.out.println("Orders by USD");
        System.out.println(ordersByUSD);
        List<T> ordersByUAH = allOrders.stream().filter(t -> t.getCurrency().equals(Currency.UAH)).collect(Collectors.toList());
        System.out.println("Orders by UAH");
        System.out.println(ordersByUAH);
    }

    public static <T extends Order> void printOrdersByCity(List<T> allOrders) {
        List<String> city = allOrders.stream().map(T::getUser).map(User::getCity).distinct().collect(Collectors.toList());
        Map<String, List<T>> orderMap = allOrders.stream().collect(Collectors.groupingBy(i -> i.getUser().getCity()));
        System.out.println(orderMap);
    }

    public static <T extends Order> void checkSoname(List<T> allOrders, String soname){
        System.out.println(allOrders.stream().filter(t -> t.getUser().getLastName().equals(soname)).collect(Collectors.toList()));
    }

    public static <T extends Order> List removeOrdersByUSD(List<T> allOrders){
        Predicate<T> pricePredicate = p -> p.getCurrency().equals(Currency.USD);
        allOrders.removeIf(pricePredicate);
        return allOrders;
    }
}
