package com.example.task01;

import java.util.Scanner;

public class Task01Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = in.nextInt();

        if(canGetDriverLicense(age)){
            System.out.print("Человек может получить права.");
        }
        else{
            System.out.print("Человек не может получить права.");
        }
    }

    static boolean canGetDriverLicense(int age) {
        if(age >= 18){
            return true;
        }

        return false;    }
}
