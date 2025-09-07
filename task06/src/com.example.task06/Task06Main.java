package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMax(221, 123412342, 331231, 212323234));

    }

    static int getMax(int a, int b, int c, int d) {
        int max = Integer.MIN_VALUE;
        int[] arr = new int[]{a,b,c,d};
        for(int i = 0;i <arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }
    }


