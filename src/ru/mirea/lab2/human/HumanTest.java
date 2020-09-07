package ru.mirea.lab2.human;

import java.util.Scanner;

public class HumanTest {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Human human1 = new Human();

        System.out.println("human1");
        System.out.println("Введите параметры головы: цвет волос, объем черепной коробки, цвет глаз");
        human1.setHead(new Head(in.next(), in.nextInt(),in.next()));
        System.out.println("Введите параметры ноги: длина, ширина бедер, размер стопы");
        human1.setLeg(new Leg(in.nextDouble(), in.nextDouble(), in.nextDouble()));
        System.out.println("Введите параметры руки: окружность кисти, длина");
        human1.setHand(new Hand(in.nextDouble(), in.nextDouble()));
        System.out.println(human1);
    }
}
