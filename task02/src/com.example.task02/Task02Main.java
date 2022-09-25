package com.example.task02;

import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int monthNumber = in.nextInt();

        System.out.print(getSeason(monthNumber));
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber){
            case 1, 2, 12:
                return "Зима";
            case 3, 4, 5:
                return "Весна";
            case 6, 7, 8:
                return "Лето";
            case 9, 10, 11:
                return "Осень";
            default:
                return "Ошибка";
        }    }
}