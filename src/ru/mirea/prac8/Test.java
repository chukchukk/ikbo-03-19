package ru.mirea.prac8;

public class Test {
    public static void main(String[] args) {
        System.out.println("Тест BoundedWaitList: ");
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(3);
        System.out.println("Добавление(1)");
        boundedWaitList.add(1);
        System.out.println("Добавление(2)");
        boundedWaitList.add(1);
        System.out.println("Добавление(3)");
        boundedWaitList.add(1);
        System.out.println("Добавление(4)");
        boundedWaitList.add(1);
        System.out.println("Capacity: " + boundedWaitList.getCapacity());

        System.out.println("--------------------------------------");
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        System.out.println("Тест UnfairWaitList: ");
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        System.out.println(unfairWaitList);
        System.out.print("Метод moveToBack: ");
        unfairWaitList.moveToBack();
        System.out.println(unfairWaitList);
    }
}
