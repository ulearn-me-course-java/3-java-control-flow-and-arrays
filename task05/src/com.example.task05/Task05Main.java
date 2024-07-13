package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
       
        System.out.println(getMin(5,4,3));
        
    }

    static int getMin(int a, int b, int c) {
        int[] nums = {a, b, c};
        int min = nums[0];
        for(int i = 0; i < 3; i++)
        {
            if(min > nums[i])
            {
                min = nums[i];
            }
        }
        return min;
    }
}
