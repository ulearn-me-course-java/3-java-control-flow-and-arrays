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
        int season = monthNumber % 12;
        if (season < 3){
            return "зима";
        }else if (season < 6){
            return "весна";
        }else if (season < 9){
            return "лето";
        }
        return "осень";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}