package ru.mirea.prac1.ball;

import java.util.Scanner;

public class BallTest {
    public static void main(String[] args) {
        int radius;
        String color;
        Scanner in = new Scanner(System.in);

        Ball ball1 = new Ball(25,"Blue");
        Ball ball2 = new Ball(50,"red");

        System.out.println(ball1);
        System.out.println(ball2);

        System.out.println("Установите новый радис для шара ball1: ");
        radius = in.nextInt();
        ball1.setRadius(radius);

        System.out.println("Установите новый цвет для шара ball1: ");
        color = in.next();
        ball1.setColor(color);
        System.out.println(ball1);
    }
}
