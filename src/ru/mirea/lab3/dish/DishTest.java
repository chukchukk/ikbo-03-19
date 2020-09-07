package ru.mirea.lab3.dish;

public class DishTest {
    public static void main(String[] args) {
        System.out.println("Тест класса Plate (тарелка)");
        Plate plate = new Plate("Стекло", 40,"суповая", 25);
        System.out.println(plate);
        plate.apply();

        System.out.println("Тест класса Glass (бокал)");
        Glass glass = new Glass("Хрусталь", 100, 40, "Ликерная стопка");
        System.out.println(glass);
        glass.apply();

        System.out.println("Тест класса Pan (сковорода)");
        Pan pan = new Pan("алюминий", 550,45,"тефлон");
        System.out.println(pan);
        pan.apply();
    }
}
