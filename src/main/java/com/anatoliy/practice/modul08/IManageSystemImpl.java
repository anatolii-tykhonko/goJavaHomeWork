package com.anatoliy.practice.modul08;

import java.util.*;
import code.SortedMapFromValue;

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
        for (T food : setOfFood) {
            if (food.getId() == id) {
                return food;
            }
        }
        return null;
    }

    public Double getPrice(T food) {
        return database.get(food);
    }

    public Set getProducts() {

        return database.keySet();
    }

    public void printProductsSortedByName() {
        Map<T, Double> sortDB = new TreeMap<T, Double>(database);
        for (Map.Entry<T, Double> sort : sortDB.entrySet()) {
            T key = sort.getKey();
            Double value = sort.getValue();
            System.out.println(key + " цена " + value);

        }
    }
    //насколько я понял сортировки по значению нету в стандыртном наборе методов МАР поэтому нашел код который можно использовать много раз и импортировал его
    public void printProductsSortedByPrice() {
        Map<T, Double> sortDB = SortedMapFromValue.sortByValue(database);
        for (Map.Entry<T, Double> sort : sortDB.entrySet()) {
            T key = sort.getKey();
            Double value = sort.getValue();
            System.out.println(key + " цена " + value);

        }
    }

    public List<Double> getPrices() {
        return new ArrayList<Double>(database.values());
    }

}
