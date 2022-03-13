package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        if (arr != null && arr.length > 0)
        {
            for (int k = 0; k < arr.length; k++)
            {
                int min = arr[k];
                int indexMin = k;
                for (int i = k; i < arr.length; i++)
                {

                    if (arr[i] < min)
                    {
                        min = arr[i];
                        indexMin = i;
                    }
                }
                arr[indexMin] = arr[k];
                arr[k] = min;

            }
        }
    }

}