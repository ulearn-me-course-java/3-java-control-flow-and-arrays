package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(12));

    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12){
            return "Winter";
        } else if (monthNumber == 3|| monthNumber == 4 || monthNumber == 5) {
            return "Spring";
        } else if (monthNumber == 6|| monthNumber == 7 || monthNumber == 8) {
            return "Summer";
        }
         else {
             return "Autumn";
        }
    }
}