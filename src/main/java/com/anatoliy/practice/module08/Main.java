package com.anatoliy.practice.module08;

public class Main {
    public static void main(String[] args) {

        Food f1 = new Food("Banana", Country.OAE, 65);
        Food f2 = new Food("Potato", Country.UKRAINE, 200);
        Food f3 = new Food("Chiken", Country.USA, 30);
        IManageSystem manage = new IManageSystemImpl();
        manage.save(f1, 200);
        manage.save(f2, 100);
        manage.save(f3, 30);
        System.out.println(manage.get(f2.getId()));
        System.out.println(manage.getProducts());
        manage.deleteById(f1.getId());
        System.out.println(manage.getProducts());
    }
}
