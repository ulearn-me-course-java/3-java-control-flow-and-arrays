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
        monthNumber = monthNumber == 12 ? 0 : monthNumber;
        int seasonNumber = monthNumber / 3;

        switch (seasonNumber) {
            case 0 : return "зима";
            case 1 : return "весна";
            case 2 : return "лето";
            case 3 : return "осень";
        }

        return "";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}