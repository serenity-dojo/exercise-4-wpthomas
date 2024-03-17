package com.serenitydojo;

public class Dog {
    private final String name;
    private final String favoriteToy;
    private final int age;
    private boolean fed = false;

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public boolean isFed() {
        return fed;
    }

    public void feed() {
        fed = true;
    }
}
