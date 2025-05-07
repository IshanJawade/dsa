package trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int n) {
        this.val = n;
        this.left = null;
        this.right = null;
    }

}

// inorder traversal
public void inorder(TreeNode root) {
    if(root == null) return;

    inorder(root.left);
    System.out.println(root.val);
    inorder(root.right);
} 

// pre-order traversal
public void preorder(TreeNode root) {
    if(root == null) return;
    
    System.out.println(root.val);
    preorder(root.left);
    preorder(root.right);
}   

// post-order traversal
public void postorder(TreeNode root) {
    if(root == null) return;

    postorder(root.left);
    postorder(root.right);
    System.out.println(root.val);
}   


public class traversals {
    public static void main(String[] args) {

    }
}