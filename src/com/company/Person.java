package com.company;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String currentCityOfResidence;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        age = -1;
        currentCityOfResidence = null;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        currentCityOfResidence = null;
    }

    public Person(String name, String surname, String currentCityOfResidence) {
        this.name = name;
        this.surname = surname;
        age = -1;
        this.currentCityOfResidence = currentCityOfResidence;
    }

    public Person(String name, String surname, int age, String currentCityOfResidence) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.currentCityOfResidence = currentCityOfResidence;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return currentCityOfResidence != null;
    }

    public void setCurrentCityOfResidence(String city) {
        currentCityOfResidence = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCurrentCityOfResidence() {
        return currentCityOfResidence == null ? "No address" : currentCityOfResidence;
    }

    public PersonBuilder newChildBuilder() {

        return new PersonBuilder().setSurname(surname).setAge(0).setCurrentCityOfResidence(currentCityOfResidence);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + (hasAge() ? age + ", " : "") + (hasAddress() ? currentCityOfResidence : "") + ")";
    }
}
