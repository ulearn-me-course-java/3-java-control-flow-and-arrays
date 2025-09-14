package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(numMin(7, 5, 9));

    }

    static int numMin(int... arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int m = 2147483647;
        int im = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m > arr[i]){
                m = arr[i];
                im = i;
            }
        }
        return im;
    }

}