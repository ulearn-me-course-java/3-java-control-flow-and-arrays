package com.example.task02;
import java.util.Arrays;
public class Task02Main {
    public static void main(String[] args) {

        System.out.println(getSeason(12));

    }

    static String getSeason(int monthNumber) {
        int[] vinter = {12,1,2};
        int[] spring = {3,4,5};
        int[] summer = {6,7,8};
        int[] autumn = {9,10,11};
        String res = "";
        for (int i = 0; i < 3; i++){
            if (vinter[i] == monthNumber){
                res = "зима";
            }
        }
        for (int i = 0; i < 3; i++){
            if (spring[i] == monthNumber){
                res = "весна";
            }
        }
        for (int i = 0; i < 3; i++){
            if (summer[i] == monthNumber){
                res = "лето";
            }
        }
        for (int i = 0; i < 3; i++){
            if (autumn[i] == monthNumber){
                res = "осень";
            }
        }


        return res;//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}