package edu.linkedlist.practise;

public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
