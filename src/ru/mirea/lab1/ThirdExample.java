package ru.mirea.lab1;

public class ThirdExample {
    final static int NUM = 10;
    public static void main(String[] args) {
        for(int i = 1; i <= NUM; i++){
            System.out.printf("%5f",(double) 1/i );
            System.out.println();
        }

    }
}
