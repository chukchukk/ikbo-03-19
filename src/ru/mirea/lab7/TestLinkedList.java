package ru.mirea.lab7;
import java.util.*;

public class TestLinkedList {
    private final static int NUM = 10;
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();    //Создаем linkedList

        for(int i = 0; i < NUM; i++){
            list.add(new Random().nextInt(50)); //Заполняем его случайными значениями в диапозоне от 0 до 50
        }
        System.out.println("Изначальный list: " + list);

        System.out.println("Метод addFirst(): ");
        list.addFirst(in.nextInt());    //Добавление элемента в начало list
        System.out.println("Метод addLast():");
        list.addLast(in.nextInt()); //Добавление элемента в конец list
        System.out.println("Текущий list: " + list);

        list.removeFirst(); //Удаление первого элемента list
        System.out.println("Метод removeFirst(): " + list);
        list.removeLast();  //Удаление последнего элемента list
        System.out.println("Метод removeLast(): " + list);

        System.out.println("Метод peekFirst(): " + list.peekFirst());   //Возвращает первый элемент без его удаления из list
        System.out.println("Метод peekLast(): " + list.peekLast()); //Возвращает последний элемент без его удаления из list

        System.out.println("Метод pollFirst(): " + list.pollFirst());   //Возвращает первый элемент, удаляя его из list
        System.out.println("Метод pollLast(): " + list.pollLast()); //Возвращает последний элемент, удаляя его из list
        System.out.println("Текущий list: " + list);

        System.out.println("Метод get(3): " + list.get(3)); //Возвращает элемент по индексу
        System.out.println("Метод size(): " + list.size()); //Возвращает размер list
        list.clear();   //Удаляет все элементы из списка
        System.out.println("Метод clear(): " + list);
    }
}
