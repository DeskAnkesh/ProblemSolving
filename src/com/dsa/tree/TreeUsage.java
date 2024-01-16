package com.dsa.tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


public class TreeUsage {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {
                50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, null, 87, null, null
        };
        Node rootNode = new Node(arr[0], null, null);
        Pair rootPair = new Pair(rootNode, 1);

        Stack<Pair> stack = new Stack<>();
        stack.push(rootPair);
        int index = 0;
        while (stack.size() > 0) {
            Pair topPair = stack.peek();

            // Left k lie kaam karna hai
            if (topPair.state == 1) {
                index++;
                if (arr[index] != null) {
                    Node leftNode = new Node(arr[index], null, null);
                    topPair.node.left = leftNode;
                    Pair leftPair = new Pair(leftNode, 1);
                    stack.push(leftPair);
                } else {
                    topPair.node.left = null;
                }
                topPair.state++;
            } else if (topPair.state == 2) {
                index++;
                if (arr[index] != null) {
                    Node rightNode = new Node(arr[index], null, null);
                    topPair.node.right = rightNode;
                    Pair rightPair = new Pair(rightNode, 1);
                    stack.push(rightPair);
                } else {
                    topPair.node.right = null;
                }
                topPair.state++;

            } else {
                stack.pop();
            }
        }

        // Move this line outside the while loop
        /*
         * display(rootNode);
         * System.out.println("size of root node is " + size(rootNode));
         * System.out.println("sum of root node is " + sum(rootNode));
         * System.out.println("max of root node is " + max(rootNode));
         * System.out.println("PostOrder");
         * traveralPostOrder(rootNode);
         * System.out.println("in Order");
         * traveralinOrder(rootNode);
         * System.out.println("pre order");
         * traveralPreOrder(rootNode);
         */
        // System.out.println("Level order");
        // levelOrderTraversal(rootNode);
        traverIterative(rootNode);
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        str += node.left == null ? "." : node.left.data + " ";
        str += "< - " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + " ";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public static int size(Node node) {
        if (node == null) {
            return 0;
        }
        int rightNodeSize = size(node.right);
        int leftNodeSizze = size(node.left);
        return rightNodeSize + leftNodeSizze + 1;
    }

    public static int sum(Node node) {
        if (node == null) {
            return 0;
        }
        int left = sum(node.left);
        int right = sum(node.right);
        int total = left + right + node.data;
        return total;
    }

    public static int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = max(node.left);
        int rightMax = max(node.right);
        int totalMax = Math.max(node.data, Math.max(leftMax, rightMax));
        return totalMax;
    }

    public static int heigth(Node node) {
        if (node == null) {
            return -1; // for edges we return -1 and for node we return 0;
        }
        int lh = heigth(node.left);
        int rh = heigth(node.right);
        int totalHeight = Math.max(lh, rh) + 1;
        return totalHeight;
    }

    public static void traveralPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        traveralPreOrder(node.left);
        traveralPreOrder(node.right);
    }

    public static void traveralinOrder(Node node) {
        if (node == null) {
            return;
        }
        traveralinOrder(node.left);
        System.out.println(node.data);

        traveralinOrder(node.right);
    }

    public static void traveralPostOrder(Node node) {
        if (node == null) {
            return;
        }
        traveralinOrder(node.left);

        traveralinOrder(node.right);
        System.out.println(node.data);
    }

    public static void levelOrderTraversal(Node node) {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        while (mq.size() > 0) {
            int count = mq.size();
            for (int i = 0; i < count; i++) {
                node = mq.remove();
                System.out.println(node.data + " ");

                if (node.left != null) {
                    mq.add(node.left);
                }
                if (node.right != null) {
                    mq.add(node.right);
                }
            }
            System.out.println();
        }

    }

    public static void traverIterative(Node node) {
        Stack<Pair> stack = new Stack<>();
        Pair rPair = new Pair(node, 1);
        stack.push(rPair);
        String preOrder = "";
        String inOrder = "";
        String postorder = "";

        while (stack.size() > 0) {
            Pair topPair = stack.peek();
            if (topPair.state == 1) {// Pr eorder me state ++ , left child dundhega
                preOrder += topPair.node.data + " ";
                topPair.state++;
                if (topPair.node.left != null) {
                    Pair leftPair = new Pair(topPair.node.left, 1);
                    stack.push(leftPair);
                }
            }
            if (topPair.state == 2) {// in order state ++ right child dhundhega
                inOrder += topPair.node.data + " ";
                topPair.state++;
                if (topPair.node.right != null) {
                    Pair rightPair = new Pair(topPair.node.right, 1);
                    stack.push(rightPair);
                }
            } else { // posst order yahan stack pop hoga
                postorder += topPair.node.data + " ";
                stack.pop();
            }
        }
        System.out.println(preOrder);
        System.out.println("  *********************   ");
        System.out.println(inOrder);
        System.out.println("  *********************   ");

        System.out.println(postorder);
    }
}
