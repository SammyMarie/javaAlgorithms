package com.sammy.arrayAlgorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArrayElements {
    public static void rotateArrayToLeft(int[] intArray){
        int tempValue = intArray[0];
        IntStream.range(0, intArray.length - 1)
                 .forEach(index -> intArray[index] = intArray[index + 1]);
        intArray[intArray.length - 1] = tempValue;
    }

    public static void rotateArrayToRight(int[] intArray){
        int tempValue = intArray[intArray.length - 1];
        System.arraycopy(intArray, 0, intArray, 1, intArray.length - 1);
        intArray[0] = tempValue;
    }

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6 };

        rotateArrayToLeft(intArray);
        Arrays.stream(intArray).forEach(System.out::println);
        System.out.println();
        rotateArrayToRight(intArray);
        Arrays.stream(intArray).forEach(System.out::println);
    }
}
