package com.sammy.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectSort(int[] numberArray){
        for(int index = 0; index < numberArray.length - 1; index++){
            int minIndex = index;
            for(int secondIndex = index + 1; secondIndex < numberArray.length; secondIndex++){
                if(numberArray[secondIndex] < numberArray[minIndex]){
                    minIndex = secondIndex;
                }
                int tempValue = numberArray[minIndex];
                numberArray[minIndex] = numberArray[index];
                numberArray[index] = tempValue;
            }
        }
        return numberArray;
        
    }

    public static void main(String[] args) {
        int[] numbers = {10, 2, 8, 6, 7, 3};
        System.out.println(Arrays.toString(selectSort(numbers)));
    }
}
