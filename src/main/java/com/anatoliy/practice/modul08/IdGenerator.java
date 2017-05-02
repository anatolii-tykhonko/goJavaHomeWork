package com.anatoliy.practice.modul08;

public final class IdGenerator {

    private IdGenerator() {
    }

    public static final long generatorId(Country country, String name) {

        long id = country.ordinal() + name.length() * 10;
        return id;
    }
}
