package com.sammy.arrayAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class FilterAndAggregate {
    public static int[] findEvenNumbers(int[] firstArray, int[] secondArray){
        List<Integer> result = new ArrayList<>();
        addEvenNumbers(firstArray, result);
        addEvenNumbers(secondArray, result);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] secondFindEvenNumbers(int[] firstArray, int[] secondArray){
        IntPredicate isEvenNumber = number -> number % 2 == 0;
        return Stream.of(firstArray, secondArray)
                     .flatMapToInt(Arrays::stream)
                     .filter(isEvenNumber)
                     .toArray();
    }

    private static void addEvenNumbers(int[] firstArray, List<Integer> result) {
        for(int evenNumber : firstArray){
            if(evenNumber % 2 == 0){
                result.add(evenNumber);
            }
        }
    }

    public static void main(String[] args) {
        int[] firstArray = { -9, 3, 2, -8, 12, -16 };
        int[] secondArray = { 0, -3, -8, -35, 40, 20, 7 };

        Arrays.stream(findEvenNumbers(firstArray, secondArray))
              .forEach(System.out::println);

        System.out.println();

        Arrays.stream(secondFindEvenNumbers(firstArray, secondArray))
              .forEach(System.out::println);
    }
}
