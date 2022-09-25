package com.example.task03;

import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int weekDaysNumber = in.nextInt();

        System.out.print(getNameOfWeekDays(weekDaysNumber));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        switch (weekDaysNumber){
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Такого дня недели не существует";
        }    }
}