package com.anatoliy.practice.modul07.task073;

import com.anatoliy.practice.modul07.task071.Currency;
import com.anatoliy.practice.modul07.task071.Order;
import com.anatoliy.practice.modul07.task071.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* используем компаратор для сортировке по наибольшей цене */
        SortedSet <Order> orderSet = new TreeSet(new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                if(o1.getPrice() > o2.getPrice()){
                    return -1;
                }
                else return 1;
            }
        });
        orderSet.add(new Order(200, Currency.UAH, "Toy", "Game", new User("Tolik", "Burk", "Kiev", 1400)));
        orderSet.add(new Order(400, Currency.UAH, "Glass", "Brix", new User("Mark", "Stoul", "Lviv", 1100)));
        orderSet.add(new Order(100, Currency.UAH, "Book", "Store", new User("Borka", "Koval", "Herson", 2000)));
        orderSet.add(new Order(200, Currency.UAH, "Cloak", "Market", new User("Igor", "Koben", "Dnepr", 2100)));
        orderSet.add(new Order(350, Currency.UAH, "Toy", "GameCountry", new User("Ivan", "Marks", "Odessa", 400)));
        orderSet.add(new Order(200, Currency.UAH, "Mouse", "Zoo", new User("Alena", "Ivanov", "Lutsk", 2450)));
        orderSet.add(new Order(400, Currency.UAH, "Cat", "Zoo", new User("Mila", "Polisuk", "Kovel", 4100)));
        orderSet.add(new Order(1000, Currency.USD, "Phone", "Bootic", new User("Vera", "Gromov", "Vinnica", 200)));
        orderSet.add(new Order(400, Currency.UAH, "Glass", "Brix", new User("Mark", "Stoul", "Lviv", 1100)));
        orderSet.add(new Order(100, Currency.UAH, "Book", "Store", new User("Borka", "Koval", "Herson", 2000)));
        System.out.println("выводим заказ з наибольшей ценой");
        System.out.println(orderSet.first());
        System.out.println("проверяем есть ли заказ с фамилией Коваль");
        for(Order o : orderSet){
            if(o.getUser().getLastName().contains("Koval")){
                System.out.println(o);
            }
        }
        System.out.println("удаляем заказы с валютой доллар");
        Iterator<Order> iterator = orderSet.iterator();
        while (iterator.hasNext()){
            Order o = iterator.next();
            if(o.getCurrency().equals(Currency.USD)){
                iterator.remove();
            }
        }
        System.out.println("Количество заказов было 10, стало = " + orderSet.size());
    }
}
