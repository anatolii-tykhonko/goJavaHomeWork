package com.anatoliy.practice.module08;

import java.util.*;

public interface IManageSystem<T extends Food> {

    T save(T obj, double price);

    T save(T obj);

    void delete(T obj);

    void deleteById(long id);

    T get(long id);

    Double getPrice(T obj);

    Set<T> getProducts();

    List<Double> getPrices();

    void printProductsSortedByName();

    void printProductsSortedByPrice();
}
