package com.sammy.linkedListAlgorithm;

import com.sammy.linkedListAlgorithm.model.Node;

public class CustomLinkedList {
    private Node head;

    public void deleteBackHalf(){
        if(head == null || head.next() == null){
            head = null;
        }

        Node slow = head;
        Node fast = head;
        Node previous = Node.builder().build();

        while(fast != null && fast.next() != null){
            fast = fast.next().next();
            previous = slow;
            slow = slow.next();
        }

        previous.setNext(null);
    }

    public void displayContents(){
        Node current = head;
        while (current != null){
            System.out.print(current.data() + "->");
            current = current.next();
        }

        System.out.println();
    }

    public Node head() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
