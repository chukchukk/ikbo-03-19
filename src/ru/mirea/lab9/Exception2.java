package ru.mirea.lab9;

import java.util.Scanner;

//task2
public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (Exception ex){ //Можно было бы сделать несколько catch блоков, чтобы ловить разные типы ошибок, но этот
            System.out.println("Exception: " + ex); //вариант в любом случае поймает эти исключения и выведет их
        } finally {
            System.out.println("Exit.");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
