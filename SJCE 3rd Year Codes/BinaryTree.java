
import java.util.*;
import java.util.LinkedList;

public class BinaryTree {

    Node root;

    static class Node {
        Node left, right;
        int val;

        Node(int v) {
            val = v;
            left = right = null;
        }
    }

    void insert(int val) {
        Node new_node = new Node(val);

        if (root == null) {
            root = new_node;
            // System.out.println(val +" : Value inserted Succesfully");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (true) {
            Node curr = q.poll();

            if (curr.left == null) {
                curr.left = new_node;
                break;
            } else {
                q.add(curr.left);
            }

            if (curr.right == null) {
                curr.right = new_node;
                break;
            } else {
                q.add(curr.right);
            }
        }

        // System.out.println(val +" : Value inserted Succesfully");
    }

    void preOrder(Node root) {

        if (root == null)
            return;

        System.out.print(root.val + " "); // Val
        preOrder(root.left); // Left
        preOrder(root.right); // Right

    }

    void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left); // Left
        System.out.print(root.val + " "); // Val
        inOrder(root.right); // Right
    }

    void postOrder(Node root) {

        if (root == null)
            return;

        postOrder(root.left); // Left
        postOrder(root.right); // Right
        System.out.print(root.val + " "); // Val
    }

    // int count = 0;
    int countNodes(Node root) {
        if (root == null)
            return 0;
        // count++;
        // countNodes(root.left);
        // countNodes(root.right);

        // return count;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    List<Integer> res = new ArrayList<>();

    void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            res.add(curr.val);

            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
        System.out.print(res);
    }

    int maxDepth(Node root) {
        if (root == null)
            return 0;
        int count = 0;
        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            count++;
        }
        return count;
    }

    List<Integer> leftView = new ArrayList<>();

    void leftView(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (i == 0)
                    leftView.add(curr.val);
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }

        }

        System.out.print(leftView);

    }

    List<Integer> rightView = new ArrayList<>();

    void rightView(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (i == size - 1)
                    rightView.add(curr.val);
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }

        }

        System.out.println(rightView);

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(50);
        bt.insert(25);
        bt.insert(75);
        bt.insert(10);
        bt.insert(35);
        bt.insert(60);
        bt.insert(90);
        bt.insert(55);
        System.out.print("PreOrder : ");
        bt.preOrder(bt.root);
        System.out.println();
        System.out.print("InOrder : ");
        bt.inOrder(bt.root);
        System.out.println();
        System.out.print("PostOrder : ");
        bt.postOrder(bt.root);
        System.out.println();
        System.out.print("Total Nodes : " + bt.countNodes(bt.root));
        System.out.println();
        System.out.print("LevelOrder : ");
        bt.levelOrder(bt.root);
        System.out.println();
        System.out.print("Depth of Binary Tree : " + bt.maxDepth(bt.root));
        System.out.println();
        System.out.print("LeftView : ");
        bt.leftView(bt.root);
        System.out.println();
        System.out.print("rightView : ");
        bt.rightView(bt.root);

    }
}

// 50
// / \
// 25 75
// / \ / \
// 10 35 60 90
// /
// 55