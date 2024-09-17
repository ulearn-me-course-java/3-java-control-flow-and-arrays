package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {

        Integer[] arr = new Integer[] {a, b, c, d};
        Integer max = null;

        for (int num: arr ) {
            if(max == null || num > max)
                max = num;

        }

        return max;

    }

}