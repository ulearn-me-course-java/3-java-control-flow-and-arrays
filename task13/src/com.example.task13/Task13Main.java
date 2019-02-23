package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;

        int cnt = 0;
        for (int e : arr) {
            if (e < 1000)
                cnt++;
        }

        int[] res = new int[cnt];
        cnt = 0;

        for(int e: arr){
            if(e < 1000){
                res[cnt] = e;
                cnt++;
            }
        }

        return res;
    }

}