package ru.mirea.prac1.dog;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        int age;
        String name;
        int weight;
        Scanner in = new Scanner(System.in);

        Dog dog1 = new Dog(2, "Jack", 20, 100);
        Dog dog2 = new Dog();

        System.out.println("Information about dog1: age = " + dog1.getAge() + ", name = "
                + dog2.getName() + ", weight = " + dog1.getWeight() + ", feed = " + dog1.checkFeed());

        System.out.print("Введите возраст для dog2: ");
        age = in.nextInt();
        dog2.setAge(age);

        System.out.println();
        System.out.print("Введите имя dog2: ");
        name = in.next();
        dog2.setName(name);

        System.out.println();
        System.out.print("Введите вес собаки : ");
        weight = in.nextInt();
        dog2.setWeight(weight);

        System.out.println();
        dog2.feeding();

        System.out.println();
        System.out.println(dog2);
    }
}
