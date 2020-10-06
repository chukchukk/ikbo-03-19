package ru.mirea.prac12;

import java.util.*;
/*
Я решил немного изменить задачу: вместо String полей использую Map,
 чтобы было удобно манипулировать со строкой и выводом значений.
 Использую LinkedHashMap, чтобы выводить в порядке добавления.
 Надеюсь, вы не будете против).
 */

public class Address {
    private String address;
    private Map<String, String> addressMap;
    private final LinkedList<String> VALUES = new LinkedList<>();

    public Address(String address) {
        this.address = address.trim();
        addressMap = new LinkedHashMap<>();
        VALUES.addAll(Arrays.asList("country", "region", "city", "street", "home", "body", "flat"));
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void splitByComma(){
        String [] splitArr = address.split(",");
        for(int i = 0; i < splitArr.length; i++){
            addressMap.put(VALUES.get(i), splitArr[i].trim());
        }
    }

    public void display(){
        System.out.println(addressMap);
    }

    public void splitByAnySymbol(){
        int i =0;
        StringTokenizer tokens = new StringTokenizer(address,"[,.;-]");
        while (tokens.hasMoreTokens()){
            addressMap.put(VALUES.get(i), tokens.nextToken().trim());
            i++;
        }
    }
}
