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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        String[] seasons = {
                "зима",
                "весна",
                "лето",
                "осень"
        };

        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) return seasons[0];
        else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) return seasons[1];
        else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) return seasons[2];
        else return seasons[3];
    }
}