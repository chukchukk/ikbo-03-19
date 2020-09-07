package ru.mirea.prac2.ball;

import java.util.Scanner;

public class TestBall {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Тест класса Ball");
        Ball ball1 = new Ball(1,1);
        Ball ball2 = new Ball();
        System.out.println("Метод toString() для ball1: " + ball1);
        System.out.println("Метод setX():");
        ball2.setX(in.nextDouble());
        System.out.println("Метод setY():");
        ball2.setY(in.nextDouble());
        System.out.println("ball2: x = " + ball2.getX() + ", y = " + ball2.getY());
        System.out.println("Метод move(): ");
        ball2.move(in.nextDouble(), in.nextDouble());
        System.out.println(ball2);
    }
}
