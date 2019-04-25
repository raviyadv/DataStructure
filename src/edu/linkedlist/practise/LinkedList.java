package edu.linkedlist.practise;

public class LinkedList {
    static Node head;

    public static void main(String[] args) {
        printLinkedList(getLinkedList());
        System.out.println();
    //    head = null;
     //   System.out.println("Count ::" + getCount(getLinkedList()));
    //    head=null;
    //    System.out.println("Sum  ::"+getSumOfLinkedList(getLinkedList()));
          head=null;
        System.out.println(getMaximumFromLinkedList(getLinkedList()));
    }

    private static Node getLinkedList() {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        return head;
    }

    public static void printLinkedList(Node head) {
        if (head == null)
            return;
        System.out.print(head.data+"  ");
        printLinkedList(head.next);
    }

    public static int getCount(Node head) {
        if (head == null)
            return 0;
        return getCount(head.next) + 1;
    }
    public static int getSumOfLinkedList(Node head){
        if (head==null)
            return 0;
        return getSumOfLinkedList(head.next)+head.data;
    }
    public static int getMaximumFromLinkedList(Node head){
        int max=Integer.MIN_VALUE;
        if(head==null)
            return max;
        max=getMaximumFromLinkedList(head.next);
        return head.data>max?head.data:max;
    }
}
