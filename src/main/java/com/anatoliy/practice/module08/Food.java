package com.anatoliy.practice.module08;

import java.util.Comparator;

public class Food implements Comparable<Food>{
    private long id;
    private String name;
    private Country country;
    private int expiration;

    public Food(String name, Country country, int expiration) {
        this.id = IdGenerator.generatorId(country, name);
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int getExpiration() {
        return expiration;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Это - Food " +
                "под названием '" + name + "'";
    }

    public int compareTo(Food o) {
        return this.getName().compareTo(o.getName());
    }
}
