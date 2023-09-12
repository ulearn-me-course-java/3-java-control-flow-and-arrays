package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(12));

    }

    static String getSeason(int monthNumber) {
        String res = "весна";
        if (monthNumber==1||monthNumber==2||monthNumber==12){
            res = "зима";
        }else if (monthNumber>5 && monthNumber<9){
            res = "лето";
        } else if (monthNumber>8 && monthNumber<12){
            res = "осень";
        }
        return res;//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}