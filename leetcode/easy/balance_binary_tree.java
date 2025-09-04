package leetcode.easy;

import javax.swing.tree.TreeNode;

public class balance_binary_tree {
	
	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(right - left) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    int height(TreeNode root){
        if(root == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

}
