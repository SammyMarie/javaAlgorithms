package com.sammy.stringAlgorithm;

public class Challenge {
    public static String reverseEachWord(String value){
        if(value == null || value.isEmpty()){
            return value;
        }else{
            StringBuilder result = new StringBuilder();
            String[] valueArray = value.split(" ");

            for (int index = 0; index < valueArray.length; index++) {
                result.append(reverse(valueArray[index]));
                if (index != valueArray.length - 1){
                    result.append(" ");
                }
            }
            return result.toString();
        }
    }

    public static String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord(null));
        System.out.println(reverseEachWord(""));
        System.out.println(reverseEachWord(" "));
        System.out.println(reverseEachWord("sally is a great worker"));
        System.out.println(reverseEachWord("racer racecar madam"));
        System.out.println(reverseEachWord("what can I do today"));
    }
}
