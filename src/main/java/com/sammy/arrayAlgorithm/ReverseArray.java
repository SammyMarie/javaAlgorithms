package com.sammy.arrayAlgorithm;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse(int[] value){
        int[] result = new int[value.length];

        for(int index = 0; index < value.length; index++){
            result[index] = value[value.length - 1 - index];
        }

        return result;
    }

    public static void reverseInArray(int[] numberArray){
        for(int index = 0; index < numberArray.length / 2; index++){
            int temValue = numberArray[index];
            numberArray[index] = numberArray[numberArray.length - index - 1];
            numberArray[numberArray.length - index - 1] = temValue;
        }
    }

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6 };

        Arrays.stream(reverse(intArray)).forEach(System.out::println);
        System.out.println();
        reverseInArray(intArray);
        Arrays.stream(intArray).forEach(System.out::println);
    }
}
