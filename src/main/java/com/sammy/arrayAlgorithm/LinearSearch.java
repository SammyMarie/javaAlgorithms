package com.sammy.arrayAlgorithm;

import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[] itemArray, int item) {
        for (int current : itemArray) {
            if (current == item) {
                return item;
            }
        }

        return -1;
    }

    public static int secondLinearSearch(int[] itemArray, int item) {
        return Arrays.stream(itemArray)
                     .filter(value -> value == item)
                     .findFirst()
                     .orElse(0);
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(intArray, 1));
        System.out.println(secondLinearSearch(intArray, 8));
    }
}
