package com.sammy.linkedListAlgorithm;

import com.sammy.linkedListAlgorithm.model.Node;

public class CustomApp {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.setHead(firstNode);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(fourthNode);

        linkedList.displayContents();
    }
}
