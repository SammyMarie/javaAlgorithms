package com.sammy.hashBasedAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequencyChecks {

    public static void displayElementFrequency(int[] numbers){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int number : numbers){
            if(!frequencyMap.containsKey(number)){
                frequencyMap.put(number, 1);
            }else{
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            }
        }

        frequencyMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    public static void main(String[] args) {
        displayElementFrequency(new int[]{4, 1, 3, 4, 5, 8, 3, 4, 4, 4, 4, 6, 5});
    }
}
