package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr != null && arr.length != 0) {
            int newArrLength = 0;

            for (int elem
                    : arr)
                if (elem <= 1000) newArrLength++;

            int[] newArr = new int[newArrLength];
            int count = 0;

            for (int elem
                    : arr)
                if (elem <= 1000) newArr[count++] = elem;
            return  newArr;
        }
        return arr;
    }

}