package com.anatoliy.practice.module08;

import java.util.*;

public final class IManageSystemImpl<T extends Food> implements IManageSystem<T> {
    private Map<T, Double> database = new HashMap();

    public T save(T food, double price) {
        database.put(food, price);
        return food;
    }

    public T save(T food) {
        database.put(food, 0.0);
        return food;
    }

    public void delete(T food) {
        database.remove(food);
    }

    public void deleteById(long id) {
        Set<T> setOfFood = database.keySet();
        Iterator<T> iterator = setOfFood.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
            }
        }
    }

    public T get(long id) {
        Set<T> setOfFood = database.keySet();
        for(T food : setOfFood){
            if(food.getId() == id){
                return food;
            }
        }
        return null;
    }

    public Double getPrice(T food) {
        return database.get(food);
    }

    public  Set getProducts() {

        return database.keySet();
    }

    public List<Double> getPrices() {
        return new ArrayList<Double>(database.values());
    }

}
