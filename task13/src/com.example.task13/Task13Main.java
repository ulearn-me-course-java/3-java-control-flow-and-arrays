package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 7, 8};
        int[] arrTwo = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arrTwo));
    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr != null) {
            if (arr.length != 0)
            {
                int count = 0;
                int num = 0;

                for(int i: arr)
                    if(i < 1000)
                        count++;

                int[] resultArr = new int[count];

                for (int j : arr) {
                    if (j < 1000) {
                        resultArr[num] = j;
                        num++;
                    }
                }
                return  resultArr;
            }
            else return arr;
        }
        else return null;
    }

}