package com.dsa.tree;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;                    // Data stored in the node
    List<Node> children;          // List to store child nodes

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}
