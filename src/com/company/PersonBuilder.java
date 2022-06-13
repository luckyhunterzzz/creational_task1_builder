package com.company;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String currentCityOfResidence;
    private Person person;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Ошибка. Некорректный возраст!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCurrentCityOfResidence(String currentCityOfResidence) {
        this.currentCityOfResidence = currentCityOfResidence;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Ошибка. Недостаточно введённых данных!");
        } else if (age >= 0 && currentCityOfResidence != null) {
            return new Person(name, surname, age, currentCityOfResidence);
        } else if (age >= 0) {
            return new Person(name, surname, age);
        } else if (currentCityOfResidence != null) {
            return new Person(name, surname, currentCityOfResidence);
        } else {
            return new Person(name, surname);
        }
    }
}
