package ru.mirea.prac12;

public class Tests {
    public static void main(String[] args) {
        //Первое задание
        Person person = new Person("Пономарев", "Денис", "Николаевич");
        System.out.println(person.fullName());

        //Второе задание, пункт а
        Address address = new Address("Россия, Липецкая область, Елец, Тургенева, 21, А, 1128Б");
        address.splitByComma();
        address.display();

        //Второе задание, пункт б
        address.setAddress("Россия; Липецкая область; Елец; Тургенева; 21; А; 1128Б");
        address.splitByAnySymbol();
        address.display();

        //Третье задание
        Shirt shirt = new Shirt();
        String []arr = {"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL", "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"};
        for(int i = 0; i < arr.length; i++){
            shirt.add(arr[i], i);
        }
        System.out.println(shirt);

        //Четвертое задание
        PhoneNumber number = new PhoneNumber("+79066833238");
        System.out.println(number.getPhoneNumber());
    }
}
