package ru.mirea.prac1.book;

public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book("Jack London",250,"27.08.1892","Book");
        System.out.println(book1);

        System.out.println();
        Book book2 = new Book();
        book2.setAuthor("Alex Kanenkov");
        book2.setDateOfWriting("01.09.2020");
        book2.setNumOfPage(3);
        book2.setName("Приключения Алекса");

        System.out.println("Автор книги book2: " + book2.getAuthor() + ", дата написания = "
                + book2.getDateOfWriting() + ", кол-во страниц = " + book2.getNumOfPage() + ", название = "
                + book2.getName());
    }
}
