package ru.mirea.lab2.book;

public class Book {
    private String author;
    private String name;
    private String dateOfWriting;

    public Book(String author, String name, String dateOfWriting) {
        this.author = author;
        this.name = name;
        this.dateOfWriting = dateOfWriting;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfWriting() {
        return dateOfWriting;
    }

    public void setDateOfWriting(String dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }

    @Override
    public String toString() {
        return "Book {" +
                "author = '" + author + '\'' +
                ", name = '" + name + '\'' +
                ", dateOfWriting = '" + dateOfWriting + '\'' +
                '}';
    }
}
