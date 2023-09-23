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

        if(arr != null){
            if(arr.length > 0){
                return CreateArray(arr, GetCount(arr));
            }
            else {
                return new int[0];
            }
        }
        else {
            return null;
        }
    }

    static int GetCount(int[] array)
    {
        int count = 0;
        for (int i = 0; i < array.length;i++)
        {
            if(array[i] <= 1000)
            {
                count++;
            }
        }

        return count;
    }

    static int[] CreateArray(int[] array, int count)
    {
        int[] result = new int[count];
        int lastIndex = 0;

        for (int i = 0; i < array.length;i++)
        {
            if(array[i] <= 1000)
            {
                result[lastIndex] = array[i];
                lastIndex++;
            }
        }

        return result;
    }
}