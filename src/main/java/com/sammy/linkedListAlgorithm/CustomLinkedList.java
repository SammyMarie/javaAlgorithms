package com.sammy.linkedListAlgorithm;

import com.sammy.linkedListAlgorithm.model.Node;

import java.util.HashSet;
import java.util.Set;

public class CustomLinkedList {
    private Node head;

    public void deleteKthNodeFromEnd(int k){
        if(head == null |k == 0){
            return;
        }

        Node first = head;
        Node second = head;

        for(int index = 0; index < k; index++){
            second = second.next();
            if(second.next() == null){
                //k >= length of list
                if(index == k - 1){
                    head = head.next();
                }
                return;
            }
        }

        while(second.next() != null){
            first = first.next();
            second = second.next();
        }

        first.setNext(first.next().next());
    }

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

    public boolean hasCycle() {

        Set<Node> nodes = new HashSet<>();
        Node current = head;
        while(current != null){
            if(nodes.contains(current)){
                return true;
            }else{
                nodes.add(current);
            }
            current = current.next();
        }

        return false;
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
