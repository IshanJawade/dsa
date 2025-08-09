package leetcode.easy;

import javax.swing.tree.TreeNode;

public class diameter_of_binary_tree {

	public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        heigth(root, diameter);
        return diameter[0];
    }

    int heigth(TreeNode root, int[] diameter){
		if(root == null) return 0;

		int leftHeight = height(root.left, diameter);
		int rightHeight = height(root.right, diameter);

		diameter[0] = Math.max(diameter[0], (leftHeight+rightHeight));

		return 1 + Math.max(leftHeight, rightHeight);
	}
}
