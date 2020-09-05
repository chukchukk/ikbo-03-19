package ru.mirea.prac1.book;


public class Book {
    private String author;
    private int numOfPage;
    private String dateOfWriting;
    private String name;

    public Book(String author, int numOfPage, String dateOfWriting, String name) {
        this.author = author;
        this.numOfPage = numOfPage;
        this.dateOfWriting = dateOfWriting;
        this.name = name;
    }

    public Book(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public String getDateOfWriting() {
        return dateOfWriting;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public void setDateOfWriting(String dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }

    @Override
    public String toString() {
        return "Book {" +
                "author = '" + author + '\'' +
                ", numOfPage=" + numOfPage +
                ", dateOfWriting = '" + dateOfWriting + '\'' +
                '}';
    }
}
