package leetcode.hard;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
}

public class serialize_deserialize {

    // codes tree into a string
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    public void serializeHelper(TreeNode node, StringBuilder sb) {
        if(node == null) {
            sb.append("null").append(" ");
            return;
        }
        sb.append(node.val).append(" ");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split("\\s+");
        Queue<String> queue = new LinkedList<>(Arrays.asList(values));
        return deserializeHelper(queue);
    }

    public TreeNode deserializeHelper(Queue<String> queue) {
        if(queue.isEmpty()) return null;
        
        // get and remove the front
        String val = queue.poll();

        if(val.equals("null")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper(queue);
        node.right = deserializeHelper(queue);
        return node;
    }
}
