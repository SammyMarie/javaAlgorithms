package com.sammy.stringAlgorithm;

public class ReverseString {
    public static String reverseString(String value){
        if(value == null || value.isEmpty()){
            return value;
        }

        StringBuilder reversed = new StringBuilder();
        for(int index = value.length() - 1; index >= 0; index--){
            reversed.append(value.charAt(index));
        }

        return reversed.toString();
    }

    public static String secondReverse(String value){
        if(value == null || value.isEmpty()){
            return value;
        }else{
            return new StringBuilder(value).reverse().toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(secondReverse(null));
        System.out.println(reverseString(""));
        System.out.println(reverseString("hello"));
        System.out.println(secondReverse("tacos"));
        System.out.println(reverseString("Hi!"));
    }
}
