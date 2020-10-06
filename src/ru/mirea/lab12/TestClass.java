package ru.mirea.lab12;

public class TestClass {
    public static void main(String[] args) {
        //Задание - проверка, является ли строкой строкой abcdefghijklmnopqrstuv18340
        SecondEx secondEx0 = new SecondEx("abcdefghijklmnopqrstuv18340");
        System.out.println(secondEx0.isLine());

        //Задание - проверка, является строка корректным e-mail адрессом
        EmailChecker emailChecker = new EmailChecker("denis_ponomarev_2012@mail.ru");
        System.out.println(emailChecker.isEmail());

        //Задание - найти число со знаком + после него
        PlusChecker plusChecker = new PlusChecker("(1 + 8) – 9 / 4");
        System.out.println(plusChecker.hasPlus());
    }
}
