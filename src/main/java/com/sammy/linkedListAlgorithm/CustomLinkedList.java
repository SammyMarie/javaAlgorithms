package com.sammy.linkedListAlgorithm;

import com.sammy.linkedListAlgorithm.model.Node;

public class CustomLinkedList {
    private Node head;

    public Node head() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void displayContents(){
        Node current = head;
        while (current != null){
            System.out.print(current.data() + "->");
            current = current.next();
        }

        System.out.println();
    }
}
