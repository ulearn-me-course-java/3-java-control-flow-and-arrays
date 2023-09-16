package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr==null || arr.length==0) return arr;
        int bigNumberCounter=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>1000){
                bigNumberCounter++;
            }
        }
        int[] newArr = new int[arr.length-bigNumberCounter];
        bigNumberCounter=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]<1000){
                newArr[i-bigNumberCounter]=arr[i];
            }
            else{
                bigNumberCounter++;
            }

        }
        return  newArr;
    }

}