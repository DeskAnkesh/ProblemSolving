package com.dsa.tree;

import java.util.*;

public class GenericTreeTraversal {

    // Method to perform level-order traversal linewise
    public static void levelOrderLinewise(Node node) {
        Queue<Node> mq = new ArrayDeque<>();  // Main queue to store nodes of current level
        mq.add(node);                        // Add root node to the main queue

        Queue<Node> cq = new ArrayDeque<>();  // Child queue to store the nodes for the next level

        // Loop until all levels are processed
        while (!mq.isEmpty()) {
            node = mq.remove();               // Remove node from the main queue
            System.out.print(node.data + " "); // Print node's data

            // Add all the children of the current node to the child queue
            for (Node child : node.children) {
                cq.add(child);
            }

            // If the main queue is empty, move to the next level
            if (mq.size() == 0) {
                mq = cq;                      // Move child queue to the main queue
                cq = new ArrayDeque<>();      // Reset the child queue for the next level
                System.out.println();         // Print a new line for the next level
            }
        }
    }

    // Driver function to test the tree traversal
    public static void main(String[] args) {
        // Creating a sample tree:
        //              1
        //            / | \
        //           2  3  4
        //          / \     \
        //         5   6     7

        // Create nodes for the tree
        Node root = new Node(1);      // Root node with data 1
        Node node2 = new Node(2);     // Node with data 2
        Node node3 = new Node(3);     // Node with data 3
        Node node4 = new Node(4);     // Node with data 4
        Node node5 = new Node(5);     // Node with data 5
        Node node6 = new Node(6);     // Node with data 6
        Node node7 = new Node(7);     // Node with data 7

        // Constructing the tree
        root.children.add(node2);     // 1 -> 2
        root.children.add(node3);     // 1 -> 3
        root.children.add(node4);     // 1 -> 4
        node2.children.add(node5);    // 2 -> 5
        node2.children.add(node6);    // 2 -> 6
        node4.children.add(node7);    // 4 -> 7

        // Performing level-order traversal linewise
      //  levelOrderLinewise(root);
        levelOrderLinewise2(root);
    }

  /*  private static void levelOrderLinewise2(Node node) {
        if (node == null) return;
        Queue<Node> mq=new ArrayDeque<>();
        mq.add(node);
        mq.add(null);
        while (!mq.isEmpty()){
            node =mq.remove();
            if (Objects.nonNull(node)){
                System.out.println(node.data +" ");
                for (Node ch :node.children){
                    mq.add(ch);
                }
            }else {
                if (!mq.isEmpty()){
                    mq.add(null);
                    System.out.println();
                }
            }
        }
    } */
  private static void levelOrderLinewise2(Node node) {
      if (node == null) return;  // Handle the edge case where root is null

      Queue<Node> mq = new ArrayDeque<>();
      mq.add(node);         // Add root node
      mq.add(new Node(-1))   ;     // Add marker to signify the end of the current level

      while (!mq.isEmpty()) {
          node = mq.remove();

          if (node.data != -1) {
              System.out.print(node.data + " ");   // Print current node's data

              // Add children of the current node to the queue
              for (Node ch : node.children) {
                  mq.add(ch);
              }
          } else {
              // End of the current level, print a newline
              System.out.println();

              // If more nodes are left in the queue, add a new null marker for the next level
              if (!mq.isEmpty()) {
                  mq.add(new Node(-1));
              }
          }
      }
  }


}

