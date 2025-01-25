package leetcode.medium;

import java.util.*;

public class copy_list_with_random_pointer {
	class Node{
		int val;
		Node next;
		Node random;

		Node (int n){
			this.val = n;
			this.next = null;
			this.random = null;
		}

		public static Node copyRandomList(Node head) {
			//edge case
			if(head == null) return null;
			Map<Node, Node> map = new HashMap<>();
			
			// pointer to traverse in head
			Node cur = head;
			// making key value pair of nodes in hashmap
			while(cur != null){
				Node newNode = new Node(cur.val);
				map.put(cur, newNode);
				cur = cur.next;
			}

			// now coping links to the new list (dummy)

			cur = head;
			while(cur != null){
				Node copyNode = map.get(cur);
				copyNode.next = map.get(cur.next);
				copyNode.random = map.get(cur.random);
				cur = cur.next;
			}
			return map.get(head);
		}
	}
	public static void main(String[] args) {
		
	}
}
