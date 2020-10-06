package ru.mirea.prac12;

public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        change();
    }

    private void change(){
        String code = "";
        String number = "";
        char []chars = phoneNumber.toCharArray();
        for(int i = chars.length - 10; i < chars.length; i++) {
            number += chars[i];
        }
        for(int i = 0; i < chars.length - 10; i++){
            code += chars[i];
        }
        phoneNumber = code + " " + number.substring(0,3) + '-' + number.substring(3,6) + '-' + number.substring(6,10);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
