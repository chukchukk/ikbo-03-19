package ru.mirea.prac2.author;

import java.util.Scanner;

public class TestAuthor {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Тест класса Author");
        Author author = new Author("Max K.B.","max@mail.ru",'м');
        System.out.println("Метод toString(): " + author);
        System.out.println("Задайте новый email: ");
        author.setEmail(in.next());
        System.out.println("Метод getName(): " + author.getName() + ", getEmail(): " +
                author.getEmail() + ", getGender(): " + author.getGender() + '.');
    }
}
