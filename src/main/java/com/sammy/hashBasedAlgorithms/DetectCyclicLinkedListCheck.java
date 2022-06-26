package com.sammy.hashBasedAlgorithms;

import com.sammy.linkedListAlgorithm.CustomLinkedList;
import com.sammy.linkedListAlgorithm.model.Node;

public class DetectCyclicLinkedListCheck {


    public static void main(String[] args) {
        var noCycleLinkedList = new CustomLinkedList();

        var firstNode = new Node(3);
        var secondNode = new Node(4);
        var thirdNode = new Node(5);
        var fourthNode = new Node(6);

        noCycleLinkedList.setHead(firstNode);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(fourthNode);

        System.out.println(noCycleLinkedList.hasCycle());
        System.out.println();

        CustomLinkedList cycledLinkedList = new CustomLinkedList();
        cycledLinkedList.setHead(firstNode);
        thirdNode.setNext(secondNode);

        System.out.println(cycledLinkedList.hasCycle());
    }
}
