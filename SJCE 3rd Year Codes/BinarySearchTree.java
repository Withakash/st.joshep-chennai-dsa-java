
import java.util.*;
public class BinarySearchTree {

    Node root = null;
    static class Node{
        int val;
        Node left,right;

        Node(int v){
            val = v;
            left= right = null;
        }
    }
    List<Integer> in = new ArrayList<>();
    List<Integer> inorder(Node root){
        if(root == null) return in;

        inorder(root.left);
        in.add(root.val);
        inorder(root.right);

        return in;
    }

    boolean isValid(Node root){
        in.clear(); 
        inorder(root);
        // System.out.println(in);

        for(int i = 1; i < in.size(); i++){
            if(in.get(i) <= in.get(i-1))
             return false;
        }

        return true;

    }

    void insert(int v) {
        Node new_node = new Node(v);

        if(root == null) {
            root = new_node;
            return;
        }

        Node curr = root;
        while(curr != null){
            if(v < curr.val && curr.left != null){
                curr = curr.left;
            }
            else if(v > curr.val && curr.right != null){
                curr = curr.right;
            }
            else break;
        }

        if(v < curr.val) curr.left = new_node;
        else curr.right = new_node;
    }

    boolean search(Node root, int key){
        Node curr = root;
        while(curr != null){
            if(root.val == key) return true;
            else if ( key < root.val) root = root.left;
            else root = root.right;
        }
        return false;
    }

    public static void main(String[] str){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(2);
        bst.insert(7);
        bst.insert(12);

        System.out.println("Inorder" + bst.inorder(bst.root));
        System.out.println("isValidBST " + bst.isValid(bst.root));

    }
}
