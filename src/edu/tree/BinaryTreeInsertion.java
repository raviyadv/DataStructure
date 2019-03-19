package edu.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertion {
    static Node root;

    static class Node {
        int element;
        Node left, right;

        Node(int element) {
            this.element = element;
            this.left = this.right = null;
        }

        public static void main(String[] args) {
            root = new Node(10);
            root.left = new Node(11);
            root.right = new Node(9);
            root.left.left = new Node(7);
            root.right.left = new Node(15);
            root.right.right = new Node(8);
            System.out.println("Inorder Traversal Before Insertion:: ");
            levelOrderTraversalPrint();
            addElementToLevelOrder(12);
            addElementToLevelOrder(19);
            System.out.println("Inorder Traversal After Insertion::");
            levelOrderTraversalPrint();

        }
        private static void inOrderTraversal(){

        }

        private static void addElementToLevelOrder(int element) {
            if (root == null)
                return;
            Queue<Node> queue = new LinkedList();
            queue.add(root);
            while (!queue.isEmpty()) {
                int sizeOfQueue = queue.size();
                while (sizeOfQueue > 0) {
                    Node currentNode = queue.peek();
                    queue.remove();
                    if (currentNode.left != null)
                        queue.add(currentNode.left);
                    else {
                        currentNode.left = new Node(element);
                        return;
                    }
                    if (currentNode.right != null)
                        queue.add(currentNode.right);
                    else {
                        currentNode.right = new Node(element);
                        return;
                    }
                    sizeOfQueue--;
                }
            }
        }

        private static void levelOrderTraversalPrint() {
            if (root == null)
                return;
            Queue queue = new LinkedList();
            queue.add(root);
            while (!queue.isEmpty()) {
                int sizeOfQueue = queue.size();
                while (sizeOfQueue > 0) {
                    Node peekNode = (Node) queue.peek();
                    System.out.print(peekNode.element + " ");
                    queue.remove();
                    if (peekNode.left != null)
                        queue.add(peekNode.left);
                    if (peekNode.right != null)
                        queue.add(peekNode.right);
                    sizeOfQueue--;
                }
            }
        }
    }
}
