package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        from0to10000();
    }

    static void from0to10000() {
        int num = 0;
        while (num!=10000){
            System.out.println(num);
            ++num;
        }
    }

}