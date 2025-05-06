package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterative_traversals {

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

    // Iterative pre order 
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()) {
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if(cur.right != null ) stack.push(cur.right);
            if(cur.left != null ) stack.push(cur.left);
        }
        return list;
    }

    public static void main(String[] args) {
        
    }

}
