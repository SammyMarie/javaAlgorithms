package com.sammy.queueAndStackAlgorithm;

import java.util.Stack;

public class MatchingParentheses {

    public static boolean hasMatchingParentheses(String sentence){
        Stack<Character> characters = new Stack<>();

        for(int index = 0; index < sentence.length(); index++){
            char current = sentence.charAt(index);
            if(current == '('){
                characters.push(current);
            }else if(current == ')'){
                if(!characters.isEmpty()){
                    characters.pop();
                }else{
                    return false;
                }
            }
        }

        return characters.isEmpty();
    }

    public static boolean isMatchingParentheses(String sentence){
        int matchingSymbolTracker = 0;

        for(int index = 0; index < sentence.length(); index++){
            char current = sentence.charAt(index);
            if(current == '('){
                matchingSymbolTracker++;
            }else if(current == ')'){
                if(matchingSymbolTracker > 0){
                    matchingSymbolTracker--;
                }else{
                    return false;
                }
            }
        }

        return matchingSymbolTracker == 0;
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("((algorithm))"));
        System.out.println(hasMatchingParentheses("(algorithm)"));
        System.out.println();

        System.out.println(hasMatchingParentheses("(algorithm("));
        System.out.println(hasMatchingParentheses(")algorithm)"));
        System.out.println(hasMatchingParentheses(")algorithm("));
        System.out.println(hasMatchingParentheses("((algorithm(("));
        System.out.println(hasMatchingParentheses("(algorithm"));
        System.out.println(hasMatchingParentheses("((algorithm)"));
    }
}
