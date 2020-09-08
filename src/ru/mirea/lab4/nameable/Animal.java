package ru.mirea.lab4.nameable;

public class Animal implements Nameable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
