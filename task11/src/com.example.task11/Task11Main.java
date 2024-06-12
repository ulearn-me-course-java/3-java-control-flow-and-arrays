package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
       
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
        
    }

     static void swap(int[] arr) {
        for(int ar : arr)
        {
            System.out.print(ar + " ");
        }System.out.println();

        int j = numMin(arr);
        int temp = arr[0];
        arr[0] = arr[j];
        arr[j] = temp;

        for(int ar : arr)
        {
            System.out.print(ar + " ");
        }
    }
    static int numMin(int[] arr)
    {
        int minNum = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < minNum)
            {
                minNum = i;
            }
        }
        return minNum;
    }

}
