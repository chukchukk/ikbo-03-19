package ru.mirea.prac11;

public class Tests {
    public static void main(String[] args) {
        System.out.println("Тест класса ArrayQueueModule");
        for(int i = 0; i < 10; i++){
            ArrayQueueModule.enqueue(i);
        }
        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Размер: " + ArrayQueueModule.size());
        System.out.println("Метод dequeue: " + ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.StringValue());
        ArrayQueueModule.clear();

        System.out.println();
        System.out.println("Тест класса ArrayQueue");

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        for(int i = 0; i < 10; i++){
            arrayQueue.enqueue(i);
        }
        System.out.println("Первый элемент: " + arrayQueue.element());
        System.out.println("Размер: " + arrayQueue.size());
        System.out.println("Метод dequeue: " + arrayQueue.dequeue());
        System.out.println(arrayQueue);
        arrayQueue.clear();

        System.out.println();
        System.out.println("Тест класса ArrayQueueADT");
        ArrayQueueADT adt = new ArrayQueueADT();
        for(int i = 0; i < 10; i++){
            ArrayQueueADT.enqueue(adt, i);
        }
        System.out.println("Первый элемент: " + ArrayQueueADT.element(adt));
        System.out.println("Размер: " + ArrayQueueADT.size(adt));
        System.out.println("Метод dequeue: " + ArrayQueueADT.dequeue(adt));
        System.out.println(adt);
        ArrayQueueADT.clear(adt);

        System.out.println("\nТест класса LinkedQueue");
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        for(int i = 0; i < 10; i++){
            linkedQueue.enqueue(i);
        }
        System.out.println("Первый элемент: " + linkedQueue.element());
        System.out.println("Размер: " + linkedQueue.size());
        System.out.println("Метод dequeue: " + linkedQueue.dequeue());
        System.out.println(linkedQueue);
        linkedQueue.clear();
    }
}
