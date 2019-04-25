package edu.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Node> queue = new LinkedList();
        System.out.println("Enter Root Node:: ");
        int data = scanner.nextInt();
        Node rootNode=new Node(data);
        queue.add(rootNode);
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println("Enter Left Child::");
            int nodeData = scanner.nextInt();
            if (nodeData != -1){
                Node newNode=new Node(nodeData);
                node.leftNode=newNode;
                queue.add(newNode);

            }
            System.out.println("Enter Right Child ::");
            nodeData=scanner.nextInt();
            if(nodeData!=-1)
            {
                Node newNode=new Node(nodeData);
                node.rightNode=newNode;
                queue.add(newNode);
            }
        }
    }

    private static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            leftNode = null;
            rightNode = null;
        }
    }
}
