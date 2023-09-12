package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = null;
        int[] result = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(result));

    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null){
            return null;
        }

        int len = 0;
        for (int i=0; i< arr.length;i++){
            if (arr[i]<=1000){
                len++;
            }
        }

        int[] res = new int[len];
        int ind = 0;
        for (int i=0; i< arr.length;i++){
            if (arr[i]<=1000){
                res[ind]= arr[i];
                ind++;
            }
        }
        return  res;
    }

}