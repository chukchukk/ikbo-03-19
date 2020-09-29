package ru.mirea.prac9;

public class INNException extends Exception {
    public INNException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Ошибка - введен недействительный ИНН.";
    }
}
