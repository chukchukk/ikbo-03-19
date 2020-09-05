package ru.mirea.prac1.dog;


import java.util.Scanner;

public class Dog {
    private int age;
    private String name;
    private double weight;
    private int feed;

    public Dog(int age, String name, double weight, int feed) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.feed = feed;
    }

    public Dog(){

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


    public void feeding(){
        System.out.println("Выберите корм для вашей собаки: 1 - сухой корм (+10 к сытости), 2 - жидкий корм (+20 к сытости)");
        int k;
        Scanner in = new Scanner(System.in);
        k  =in.nextInt();
        switch (k){
            case 1: feed+=10; break;
            case 2: feed+=20; break;
            default:
                System.out.println("Неверно введен номер корма");
                break;
        }
    }

    public int checkFeed(){
        return feed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", feed=" + feed +
                '}';
    }
}