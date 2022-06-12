package com.sammy.stringAlgorithm;

public class ParsingAndSearchingStrings {

    public static void parseContents(String value){
        System.out.println("Option 1");
        for(char c : value.toCharArray()){
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Option 2");
        for(int index = 0; index < value.length(); index++){
            char c = value.charAt(index);
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        String word = "HeLLo";
        System.out.println(word.contains("LL"));

        parseContents(word);
    }
}
