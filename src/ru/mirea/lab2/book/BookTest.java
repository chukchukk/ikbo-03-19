package ru.mirea.lab2.book;

import java.util.Scanner;

public class BookTest {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String author, name, date;
        System.out.println("Введите автора книги book1: ");
        author = in.nextLine();
        System.out.println("Введите название книги book1: ");
        name = in.nextLine();
        System.out.println("Введите дату написания book1: ");
        date = in.nextLine();
        Book book1 = new Book(author,name,date);
        System.out.println(book1);

        System.out.println("------------------------------");

        Book book2 = new Book();
        System.out.println("Введите автора книги book2: ");
        author = in.nextLine();
        System.out.println("Введите название книги book2: ");
        name = in.nextLine();
        System.out.println("Введите дату написания book2: ");
        date = in.next();

        book2.setAuthor(author);
        book2.setName(name);
        book2.setDateOfWriting(date);
        System.out.println("book2: author = " + book2.getAuthor() + ", name = " + book2.getName() + ", date of writing = " + book2.getDateOfWriting());
    }
}
