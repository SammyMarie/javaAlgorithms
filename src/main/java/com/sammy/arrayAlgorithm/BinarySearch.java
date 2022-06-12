package com.sammy.arrayAlgorithm;

import java.util.Arrays;

public class BinarySearch {

    public static boolean binarySearch(int[] itemArray, int item){
        int min = 0;
        int max = itemArray.length - 1;

        while(min <= max){
            int mid = (min + max) / 2;
            if(item == itemArray[mid]){
                return true;
            } else if (item < itemArray[mid]) {
                max = mid - 1;
            }else {
                min = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(intArray, 5));
        System.out.println(binarySearch(intArray, 1));
        System.out.println(binarySearch(intArray, 8));
        System.out.println(Arrays.binarySearch(intArray, 4));
    }
}
