package com.sammy.queueAndStackAlgorithm;

import java.util.Stack;

public class NextGreaterElement {

    public static void printNextGreaterElement(int[] numbers){
        if(numbers.length == 0){
            System.out.println();
            return;
        }

        Stack<Integer> integers = new Stack<>();
        integers.push(numbers[0]);

        for (int next : numbers) {
            if (!integers.isEmpty()) {
                int popped = integers.pop();
                while (popped < next) {
                    System.out.println(popped + " --> " + next);
                    if (integers.isEmpty()) {
                        break;
                    }
                    popped = integers.pop();
                }
                if (popped > next) {
                    integers.push(popped);
                }
            }
            integers.push(next);
        }

        while(!integers.isEmpty()){
            System.out.println(integers.pop() + " --> " + -1);
        }
    }

    public static void main(String[] args) {
        printNextGreaterElement(new int[]{16, 7, 2, 5, 15});
    }
}
