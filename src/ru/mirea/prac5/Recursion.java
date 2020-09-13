package ru.mirea.prac5;

import java.util.Scanner;

public class Recursion {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Задание под номером 16:");
        numberOfMax(0,0);

        System.out.println("Задание под номером 17:");
        int maxN = max();
        System.out.println("Результат: " + maxN);

        System.out.println("Задание под номером 14: ");
        System.out.println(leftRight(in.nextInt()));

        System.out.println("Задание под номером 15: ");
        rightLeft(in.nextInt());
    }

    //16.На вход подается максимальное значение и кол-во равных максимальному элементов
    public static void numberOfMax(int max, int num) {
        int next = in.nextInt();
        if (next > 0) { //Проверка на конец последовательности
            if (next > max) {   //Если больше текущего максимума, то рекурсивно вызываем функцию, меняя параметр num на 1
                numberOfMax(next, 1);
            } else if (next == max) { //Если равенство, то увеличиваем счетчик равных максимуму элементов на 1
                numberOfMax(max, ++num);
            } else {  //В противном случае ничего не меняется
                numberOfMax(max, num);
            }
        } else {
            System.out.println("Количество элементов, равных максимальному: " + num);
        }
    }

    //17.
    public static int max() {
        int next = in.nextInt(); //Считываем следующее значение
        if (next == 0) {    //Проверка на конец последовательности, условие выхода
            return 0;
        } else {
            return Math.max(next, max());
        }
    }

    //14.
    //Рекурсивно доходим до первой цифры числа, а затем возвращаемся обратно, при этом заполняя строку
    public static String leftRight(int num) {
        if (num < 10) {
            return Integer.toString(num);
        } else {
            return leftRight(num / 10) + ' ' + num % 10;
        }
    }

    //15.
    public static void rightLeft(int num){
        if(num < 10){
            System.out.println(num);
            return;
        } else {
            System.out.println(num % 10);
            rightLeft(num / 10);
        }
    }
}
