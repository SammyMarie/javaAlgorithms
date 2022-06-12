package com.sammy;

public class PasswordComplexityAlgorithm {
    public static boolean isPasswordComplex(String password){

        return password.chars().anyMatch(Character::isUpperCase) &&
               password.chars().anyMatch(Character::isLowerCase) &&
               password.chars().anyMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(isPasswordComplex("Hell0"));
        System.out.println(isPasswordComplex("Hello"));
        System.out.println(isPasswordComplex("hello"));
        System.out.println(isPasswordComplex("HeLLo"));
        System.out.println(isPasswordComplex("hello"));
        System.out.println(isPasswordComplex(" "));
    }
}
