package ru.mirea.prac9;

import java.util.Scanner;

public class Profile {
    private String fio;
    private String inn;

    public Profile(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String fio, inn;
        try{
            System.out.println("Введите ФИО, ИНН: ");
            fio = in.nextLine();
            inn = in.next();
            CheckerINN.checkInn(inn);
            Profile profile1 = new Profile(fio, inn);
            System.out.println("Вход выполнен успешно");
        } catch (INNException e){
            System.out.println(e);
        }

    }
}
