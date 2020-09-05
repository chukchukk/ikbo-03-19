package ru.mirea.lab1;
import java.util.Scanner;

public class FifthExample {
    static int number;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = in.nextInt();

        factorialOut();
    }

    public static void factorialOut(){
        int factorial = 1;
        if(number < 0){
            System.out.println("Невозможно вычислить факториал");
            return;
        } else {
            for(int i = 1; i <= number; i++){
                factorial*=i;
            }
        }
        System.out.println("Факториал числа " + number + " : " + factorial);
    }
}
