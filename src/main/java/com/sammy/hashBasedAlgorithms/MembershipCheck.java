package com.sammy.hashBasedAlgorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MembershipCheck {

    public static List<Integer> findMissingElements(int[] first, int[] second){
        List<Integer> missingElements = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();

        for(int number : second){
            integerSet.add(number);
        }

        for(int number : first){
            if(!integerSet.contains(number)){
                missingElements.add(number);
            }
        }

        return missingElements;
    }

    public static void main(String[] args) {
        findMissingElements(new int[]{1, 2, 3, 4}, new int[]{1, 3}).forEach(System.out::println);
        System.out.println();
        findMissingElements(new int[]{8, 0, 1, 7, 3}, new int[]{5, 7, 8, 0, 2}).forEach(System.out::println);
    }
}
