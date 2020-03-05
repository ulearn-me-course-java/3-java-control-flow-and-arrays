package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return Math.min(a,Math.min(b,c));
    }

}
/* другой метод:
        if(a < b && a < c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        return c;

 */