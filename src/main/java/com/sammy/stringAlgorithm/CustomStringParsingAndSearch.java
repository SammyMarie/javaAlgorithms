package com.sammy.stringAlgorithm;

public class CustomStringParsingAndSearch {
    public static boolean isAtEvenIndex(String value, char item){
        if(value == null || value.isEmpty()){
            return false;
        }

        for (int index = 0; index < value.length()/ 2 + 1; index = index + 2) {
            if(value.charAt(index) == item){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "HeLLo";
        System.out.println(isAtEvenIndex(word, 'L'));
        System.out.println(isAtEvenIndex(word, 'T'));
        System.out.println(isAtEvenIndex(word, 'H'));
        System.out.println(isAtEvenIndex("", 'H'));
        System.out.println(isAtEvenIndex(null, 'H'));
    }
}
