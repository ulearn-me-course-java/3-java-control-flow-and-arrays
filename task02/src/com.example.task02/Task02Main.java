package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(11));

    }

    static String getSeason(int monthNumber) {
        return (monthNumber == 12?"зима":(monthNumber > 8?"осень":(monthNumber > 5?"лето":(monthNumber > 2?"весна":"зима"))));
    }
}