package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        from0to10000();
    }

    static void from0to10000() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            string.append(i);
            string.append(System.lineSeparator());
        }
        System.out.print(string);
    }

}