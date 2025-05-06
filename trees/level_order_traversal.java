package trees;

import java.util.*;

/*
 No recursion involved 
 this is a while loop approach
 */

public class level_order_traversal {
    
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();

        // edge case
        if(root == null) return list;

        q.offer(root);

        while(!q.isEmpty()) {
            int level = q.size();
            List<Integer> subList = new LinkedList<>();

            // this loop will run number of times to perform poll() operation
            // poll should be equal to number of elements in the queue
            for(int i = 0; i < level; i++) { 
                
                // removes element from the queue and use it into operation 
                TreeNode current =  q.poll();   

                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
                subList.add(current.val);
            }
            list.add(subList);
        }
        return list;
    }

    public static void main(String[] args) {
        
    }

}
