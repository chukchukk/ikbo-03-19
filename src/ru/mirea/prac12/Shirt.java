package ru.mirea.prac12;

import java.util.StringTokenizer;

public class Shirt {
    private String []arr;
    private final int SIZE = 11;
    private final String [] VALUES = {"Code", "Type", "Color", "Size"};

    public Shirt() {
        arr = new String[SIZE];
    }

    public void add(String value, int index){
        arr[index] = value;
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < SIZE; i++){
            String []tokens = arr[i].split(",");
            for(int j = 0; j < tokens.length; j++){
                result += VALUES[j] + ":" + tokens[j] + " ";
            }
            result +='\n';
        }
        return result;
    }
}
