package com.sammy;

public class FirstAlgorithm {
    public static int findMaximum(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber > secondNumber){
            if(firstNumber > thirdNumber || firstNumber == thirdNumber){
                return firstNumber;
            }
        }

        return Math.max(secondNumber, thirdNumber);
    }

    public static int secondFindMaximum(int firstNumber, int secondNumber, int thirdNumber){
        int max = firstNumber;

        if(secondNumber > max){
            max = secondNumber;
        }

        if(thirdNumber > max){
            max = thirdNumber;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(secondFindMaximum(1, 2, 3));
        System.out.println(secondFindMaximum(8, 8, 1));
        System.out.println(secondFindMaximum(3, 2, 3));
        System.out.println(secondFindMaximum(1, 1, 9));
        System.out.println(secondFindMaximum(1, 9, 9));
    }
}
