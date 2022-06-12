package com.sammy;

public class StringAlgorithm {
    public static boolean isStringUpperCase(String word){
        return word.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isStringLowerCase(String word){
        return word.chars().allMatch(Character::isLowerCase);
    }


    public static void main(String[] args) {
        System.out.println(isStringUpperCase("hello"));
        System.out.println(isStringUpperCase("HELLO"));

        System.out.println(isStringLowerCase("hello"));
        System.out.println(isStringLowerCase("HELLO"));
    }
}
