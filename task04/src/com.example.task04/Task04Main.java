package com.example.task04;

import java.util.stream.IntStream;

public class Task04Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        from0to10000();

    }

    static void from0to10000() {
        IntStream.range(0, 10000)
                .forEach(System.out::println);
    }
}