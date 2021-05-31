import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class hackerrank20 {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        // if (root == null) {
        //     return -1;
        // }  
        // return 1 + Math.max(height(root.left), height(root.right));

        // Please note down that 
        // they have considerd height of root as '-1'. 
        // So your program should return '-1' when root is NULL.

        if (root == null) {
            return -1;
        } else {
            int left_h = height(root.left);
            int right_h = height(root.right);
            return 1 + (left_h > right_h ? left_h : right_h);
        }
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}