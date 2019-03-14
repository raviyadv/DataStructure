package edu.linkedlist;

public class LinkedListPalindrome {
    LinkedList.Node head;
    LinkedList.Node left;

    public static void main(String[] args) {
        LinkedList<Character> linkedList = LinkedList.createLinkedList(new Character[]{'R', 'A', 'D', 'A', 'R'});
        linkedList.printLinkedList();
        LinkedListPalindrome palindrome = new LinkedListPalindrome();
        palindrome.head = linkedList.head;
        System.out.println(palindrome.isPalindrome(linkedList.head));
    }

    boolean isPalindrome(LinkedList.Node right) {
        left = head;
        if (right == null)
            return true;
        boolean isp = isPalindrome(right.next);
        if (isp == false)
            return false;
        if (right.data != (left).data)
            isp = false;
        left = left.next;
        return isp;
    }

}
