package com.anatoliy.practice.module08;

public class Main {
    public static void main(String[] args) {

        Food f1 = new Food("Banana", Country.OAE, 65);
        Food f2 = new Food("Potato", Country.UKRAINE, 200);
        Food f3 = new Food("Chiken", Country.USA, 30);
        Food f4 = new Food("FastFood", Country.USA, 2);
        Food f5 = new Food("Olive", Country.OAE, 40);
        Food f6 = new Food("Meat", Country.POLAND, 15);
        Food f7 = new Food("Pie", Country.CHINA, 300);
        IManageSystem manage = new IManageSystemImpl();
        manage.save(f1, 200);
        manage.save(f2, 100);
        manage.save(f3, 30);
        manage.save(f4, 10);
        manage.save(f5, 340);
        manage.save(f6, 120);
        manage.save(f7, 35);
        System.out.println(manage.get(f2.getId()));
        System.out.println(manage.getProducts());
        manage.deleteById(f1.getId());
        System.out.println(manage.getProducts());
        System.out.println("Сортировка но названию продуктов");
        manage.printProductsSortedByName();
        System.out.println("Сортировка по цене");
        manage.printProductsSortedByPrice();
    }
}
