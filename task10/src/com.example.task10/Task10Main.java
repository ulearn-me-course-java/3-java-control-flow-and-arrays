package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        //вернуть номер минимального элемента, если несколько, то последнего
        int num = 0; //номер сравниваемого с numMin
        int numMin = 0; //номер минимального элемента
        int min = arr[0]; //минимальный элемент

        while (num < arr.length){
            if (arr[num] <= min){
                min = arr[num]; //новый numMin
                numMin = num;
                num++;
            }
            else num++;
        }
        return numMin;
    }

}