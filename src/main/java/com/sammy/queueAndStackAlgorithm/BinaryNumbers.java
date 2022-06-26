package com.sammy.queueAndStackAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {
    public static void printBinaryNumbers(int number){
        if(number <= 0){
            System.out.println();
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for(int index = 0; index < number; index++){
            int current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBinaryNumbers(3);
        printBinaryNumbers(-5);
        printBinaryNumbers(0);
        printBinaryNumbers(2);
        printBinaryNumbers(9);
    }
}
