package ru.mirea.lab1;

import java.util.Random;
import java.util.Scanner;

public class FirstExample {
    static int size;
    static int[] arr;
    static int sum;
    public static void main(String[] args) {
        initialize();
        forCycle();
        whileCycle();
        doWhileCycle();
    }

    public static void initialize(){
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        arr = new int[size];
        sum = 0;
        for(int i = 0; i < size; i++)
            arr[i] =new Random().nextInt(100);
    }

    public static void forCycle(){
        for(int i = 0; i <size; i++){
            sum+=arr[i];
        }
        System.out.println("Цикл for: сумма = " + sum);
        sum = 0;
    }

    public static void whileCycle(){
        int k = 0;
        while(k != size){
            sum+= arr[k];
            k++;
        }
        System.out.println("Цикл while: сумма = " + sum);
        sum = 0;
    }

    public static void doWhileCycle(){
        int k = 0;
        do{
            sum+= arr[k];
            k++;
        } while (k != size);
        System.out.println("Цикл while: сумма = " + sum);
        sum = 0;
    }
}
