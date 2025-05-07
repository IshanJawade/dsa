package trees;

public class identical_trees {
	
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

	public boolean isSameTree(TreeNode r1, TreeNode r2) {
		if(r1 == null || r2 == null) {
			return (r1==r2);		// this will return true OR false
		}
		// if everything is true then go ahead 
		return (r1.val == r2.val) 		&&
		isSameTree(r1.left, r2.left)	&&
		isSameTree(r1.right, r2.right);
	}
	
	public static void main(String[] args) {
		
	}
}
