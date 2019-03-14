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
        LinkedList<Character> linkedListReverse = LinkedList.createLinkedList(new Character[]{'1', '2', '3', '4', '5'});
        linkedListReverse.printLinkedList();
        linkedListReverse.head=palindrome.reverseLinkedList(linkedListReverse.head);
        linkedListReverse.printLinkedList();
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

    public LinkedList.Node reverseLinkedList(LinkedList.Node head)
    {
        LinkedList.Node current=head;
        LinkedList.Node swapedNode=head.next;
        current.next=null;
        LinkedList.Node nextNode;
        while(swapedNode!=null){
            nextNode=swapedNode.next;
            swapedNode.next=current;
            current=swapedNode;
            swapedNode=nextNode;
        }
        return current;
    }

}
