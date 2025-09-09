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

        if(root == null) return list;

        stack.push(root);

        while(!stack.empty()) {
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if(cur.right != null ) stack.push(cur.right);
            if(cur.left != null ) stack.push(cur.left);
        }
        return list;
    }

    // Iterative In Order 
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return list;

        TreeNode node = root;
        while(true) {
            if(node != null) { 
                stack.push(node);
                node = node.left;
            } else {
                if(stack.isEmpty()) break;

                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }

    // Interative Post order (using 2 stacks)
    public List<Integer> postOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        if(root == null) return list;

        stack1.push(root);

        while(!stack1.isEmpty()) {
            root = stack1.pop();
            stack2.push(root);
            if(root.left != null) stack1.push(root.left);
            if(root.right != null) stack1.push(root.right);
        }
        while(!stack2.isEmpty()) {
            list.add(stack2.pop().val);
        }
        return list;
    }

    

    public static void main(String[] args) {
        
    }

}
