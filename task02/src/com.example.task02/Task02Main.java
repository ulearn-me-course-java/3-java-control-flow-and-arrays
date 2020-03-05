package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int mn) {
        if (mn == 12 || mn == 1 || mn == 2){ //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
            return "зима";
        }
        else if (mn < 2 && mn > 6){
            return "весна";
        }
        else if (mn < 5 && mn > 9){
            return "лето";
        }
        else {
            return "осень";
        }
    }
}