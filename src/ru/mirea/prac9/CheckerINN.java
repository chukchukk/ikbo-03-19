package ru.mirea.prac9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CheckerINN {
    private static List<String> innList = new LinkedList<>();

    public static void checkInn(String inn) throws INNException {
        innList.addAll(Arrays.asList("1111111111","2222222222", "333333333333"));

        if(innList.contains(inn))
            return;
        else throw new INNException("");
    }
}
