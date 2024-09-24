package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        if(isBetween(1,2, monthNumber)){
            return "зима";
        }
        else if(isBetween(3, 5,monthNumber)){
            return "весна";
        }
        else if(isBetween(6,8, monthNumber)){
            return "лето";
        }
        else if (isBetween(9, 11, monthNumber)) {
            return "осень";
        }
            return "зима";
        // return "";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

    static boolean isBetween(int min, int max, int value){
        return value >= min && value <= max;
    }
}