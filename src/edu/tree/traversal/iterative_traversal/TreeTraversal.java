package edu.tree.traversal.iterative_traversal;

import java.util.LinkedList;
import java.util.Queue;

// A binary tree node
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right;
    }
}

class BinaryTree {
    Node root;

    int treeHeight(Node node) {
        if (node == null)
            return 0;
        Queue<Node> q = new LinkedList();
        q.add(node);
        int height = 0;
        while (1 == 1) {
            int nodeCount = q.size();
            if (nodeCount == 0)
                return height;
            height++;
            while (nodeCount > 0) {
                Node newnode = q.peek();
                q.remove();
                if (newnode.left != null)
                    q.add(newnode.left);
                if (newnode.right != null)
                    q.add(newnode.right);
                nodeCount--;
            }
        }
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.left.right.right = new Node(7);
        System.out.println(tree.levelCountByIterative(tree.root));
        tree.printAllNodeLevelTraversal(tree.root);
    }

    public int levelCountByIterative(Node rootNode){
        if(rootNode==null)
            return 0;
        Queue queue=new LinkedList();
        queue.add(rootNode);
        int height=0;
        while(true){
            if(queue.isEmpty())
                return height;
            height++;
            int countNode=queue.size();
            while(countNode>0)
            {
                Node deQueueNode=(Node)queue.peek();
                queue.remove();
                if(deQueueNode.left!=null)
                    queue.add(deQueueNode.left);
                if(deQueueNode.right!=null)
                    queue.add(deQueueNode.right);
                countNode--;
            }
        }
    }
    public void printAllNodeLevelTraversal(Node root){
        if(root==null)
            return;
        Queue queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int elementCount=queue.size();
            while(elementCount>0)
            {
                Node node=(Node)queue.peek();
                queue.remove();
                System.out.print(node.data+" ");
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                elementCount--;
            }
        }

    }
}