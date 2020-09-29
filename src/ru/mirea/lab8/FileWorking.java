package ru.mirea.lab8;

import java.io.*;
import java.util.Scanner;

public class FileWorking {
    private static Scanner in = new Scanner(System.in);
    private static File file = new File("D://test.txt");
    public static void main(String[] args) {
        write();
        read();
        addToTheEnd();
    }

    public static void write(){
        String text = new String();
        try {
            System.out.println("Ввод информации: ");
            FileWriter fileWriter = new FileWriter(file, false);    //false - каждый раз перезаписывает информацию
            text = in.nextLine();
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(){
        int sym;
        try {
            System.out.println("Вывод информации из файла:");
            FileReader fileReader = new FileReader(file);
            while ((sym = fileReader.read()) != -1){    //Посимвольно читаем содержимое файла и выводим
                System.out.print((char) sym);
            }
            System.out.println();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addToTheEnd(){
        String text = new String();
        try {
            System.out.println("Ввод информации в конец файла: ");
            FileWriter fileWriter = new FileWriter(file, true);    //true - информация добавляет в конец
            text = in.nextLine();
            fileWriter.write(text);
            //fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
