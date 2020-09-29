package ru.mirea.prac10.chairs;

public class Client {
    public Chair chair;

    public void sit(){
        chair.sit();
    }

    public void setChair(Chair chair){
        this.chair = chair;
    }
}
