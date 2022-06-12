package com.sammy.linkedListAlgorithm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class Node {
    private final int data;
    private Node next;

    public Node(int data){
        this.data = data;
    }

    public int data() {
        return data;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
