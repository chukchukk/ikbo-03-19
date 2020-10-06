package ru.mirea.prac12;

import java.io.Serializable;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public String fullName(){
        if(firstName == null && middleName == null){
            return lastName;
        }
        else {
            return new StringBuilder().append(lastName).append(" ")
                    .append(firstName.charAt(0)).append('.').
                            append(middleName.charAt(0)).append('.').toString();
        }
    }
}
