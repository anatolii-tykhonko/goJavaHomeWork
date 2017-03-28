package com.anatoliy.practice.modul07.tack071;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList();
        orderList.add(new Order(200, Currency.UAH, "Toy", "Game", new User("Tolik", "Burk", "Kiev", 1400)));
        orderList.add(new Order(400, Currency.UAH, "Glass", "Brix", new User("Mark", "Stoul", "Lviv", 1100)));
        orderList.add(new Order(100, Currency.UAH, "Book", "Store", new User("Borka", "Koval", "Herson", 2000)));
        orderList.add(new Order(200, Currency.UAH, "Cloak", "Market", new User("Igor", "Koben", "Dnepr", 2100)));
        orderList.add(new Order(350, Currency.UAH, "Toy", "GameCountry", new User("Ivan", "Marks", "Odessa", 400)));
        orderList.add(new Order(200, Currency.UAH, "Mouse", "Zoo", new User("Alena", "Ivanov", "Lutsk", 2450)));
        orderList.add(new Order(400, Currency.UAH, "Cat", "Zoo", new User("Mila", "Polisuk", "Kovel", 4100)));
        orderList.add(new Order(1000, Currency.UAH, "Phone", "Bootic", new User("Vera", "Gromov", "Vinnica", 200)));
        orderList.add(new Order(380, Currency.UAH, "Car", "Game", new User("Katya", "Bang", "Harkov", 40000)));
        orderList.add(new Order(550, Currency.UAH, "Pens", "Build", new User("Lena", "Burk", "Krakov", 1200)));

        Collections.sort(orderList, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else return 1;
            }
        });
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i));
        }
        System.out.println();

        Collections.sort(orderList, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                } else return 1;
            }
        });
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i));
        }
        System.out.println();

        Collections.sort(orderList, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().compareTo(o2.getItemName()) == 0) {
                    if (o1.getId() < o2.getId()) {
                        return -1;
                    } else if (o1.getPrice() == o2.getPrice()) {
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    } else {
                        return 1;
                    }
                } else {
                    return o1.getItemName().compareTo(o2.getItemName());
                }
            }
        });
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i));
        }
        System.out.println();
    }

}
