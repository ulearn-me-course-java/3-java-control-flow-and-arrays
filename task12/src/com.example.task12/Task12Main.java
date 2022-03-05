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
        if (arr == null) return;
        arr = SelectionSort(arr,0);
    }



    private static int indexOfMin(int[] array, int n)
    {
        int result = n;
        for (int i = n; i < array.length; ++i)
        {
            if (array[i] < array[result])
            {
                result = i;
            }
        }

        return result;
    }

    public static int[] SelectionSort(int[] array, int currentIndex)
    {
        if (currentIndex == array.length) return array;

        int index = indexOfMin(array, currentIndex);
        if (index != currentIndex)
        {
            int t = array[index];
            array[index] = array[currentIndex];
            array[currentIndex] = t;
        }

        return SelectionSort(array, currentIndex + 1);
    }
}