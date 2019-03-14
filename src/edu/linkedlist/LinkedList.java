package edu.linkedlist;

public class LinkedList<T> {
    Node<T> head;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        LinkedList linkedList = LinkedList.createLinkedList();
        linkedList.printLinkedList();
        System.out.println(linkedList.count());
        System.out.println(linkedList.countRecursive(linkedList.head));
        //     System.out.println(linkedList.insertElement(0, "Yadav"));
   //     System.out.println(linkedList.insertElement(1, "Yadav"));
   //     System.out.println(linkedList.insertElement(10, "Yadavvvv"));
   //     System.out.println(linkedList.insertElement(6, "Yadavend"));
   //     System.out.println(linkedList.insertElement(3, "YadavMid"));
  //      System.out.println(linkedList.count());
   //     linkedList.printLinkedList();
        System.out.println(linkedList.deleteLinkedNode(0));
        System.out.println(linkedList.deleteLinkedNode(1));
        System.out.println(linkedList.deleteLinkedNode(10));
        System.out.println(linkedList.deleteLinkedNode(4));
        linkedList.printLinkedList();
        System.out.println(linkedList.count());
        System.out.println(linkedList.countRecursive(linkedList.head));

    }

    public void printLinkedList() {
        if (head == null)
            return;
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static LinkedList<String> createLinkedList() {
        LinkedList<String> linkedList = new LinkedList<String>();
        LinkedList.Node<String> node = new Node<String>("Ravi");
        linkedList.head = node;
        LinkedList.Node<String> node1 = new Node<String>("Nisha");
        LinkedList.Node<String> node2 = new Node<String>("Bunty");
        LinkedList.Node<String> node3 = new Node<String>("Kaku");
        LinkedList.Node<String> node4 = new Node<String>("Sushil");
        linkedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return linkedList;
    }

    public int count() {
        if (head == null)
            return 0;
        Node<T> currentNode = head;
        int count = 0;
        while (currentNode != null) {
            ++count;
            currentNode = currentNode.next;
        }
        return count;
    }

    public boolean insertElement(int position, String data) {
        if (position <= 0)
            return false;
        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return true;
        }
        int count = 1;
        Node currentNode = head;
        while (count < position && currentNode != null) {
            ++count;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            Node newNode = new Node(data);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            return true;
        }
        return false;
    }

    public boolean deleteLinkedNode(int position) {
        if (position <= 0 || head == null)
            return false;
        if (position == 1) {
            head = head.next;
            return true;
        }
        int count = 2;
        Node currentNode = head;
        while (count < position && currentNode != null) {
            ++count;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            if (currentNode.next.next !=null)
                currentNode.next = currentNode.next.next;
            else
                currentNode.next = null;
            return true;
        }
        return false;
    }
    public int countRecursive(Node currentNode){
        if(currentNode==null)
            return 0;
        return 1+countRecursive(currentNode.next);
    }

    public static <T> LinkedList<T> createLinkedList(T[] elements){
        LinkedList<T> linkedList=new LinkedList();
        Node<T> currentNode=null;
        for(T typeData:elements)
        {
            if(linkedList.head==null) {
                linkedList.head = new Node<T>(typeData);
                currentNode=linkedList.head;
                continue;
            }
            currentNode.next=new Node<T>(typeData);
            currentNode=currentNode.next;
        }
        return linkedList;
    }
}
