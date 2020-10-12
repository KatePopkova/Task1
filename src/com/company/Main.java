package com.company;

public class Main {

    public static void main(String[] args) {
        Integer number1 = 3;
        Integer number2 = 7;
        if(number1 > number2){
            System.out.printf("Число %s больше %s\n", number1.toString(), number2.toString());
        }
        else{
            System.out.printf("Число %s меньше %s\n", number1.toString(), number2.toString());
        }
        System.out.printf("Сумма %s и %s равна %s", number1, number2, (number1 + number2));
    }
}
