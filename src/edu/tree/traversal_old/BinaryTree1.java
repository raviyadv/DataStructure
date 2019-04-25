package edu.tree.traversal_old;

public class BinaryTree1 {
    Node root;

    BinaryTree1(int data) {
        root = new Node(data);
    }

    BinaryTree1() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree1 binaryTree=new BinaryTree1(1);
        Node root=binaryTree.root;
     /*   root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        */
    }
    private static class Node {
        int data;
       // edu.tree.Node left, right;

        Node(int elementData) {
            this.data = elementData;
      //      left = right = null;
        }
}


}
