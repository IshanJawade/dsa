package leetcode.easy;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class merge_linkedlist {
	class Node{
		int val;
		Node next;
	
		// constructor of Node classes with overloading
		public Node(){
			this.next = null;
		}
		public Node(int d){
			this.val = d;
			this.next = null;
		}
		public Node(int d, Node n){
			this.val = d;
			this.next = n;
		}

		public static Node mergeTwoLists(Node list1, Node list2) {
			Node temp = new Node(-1);
			Node cur = temp;
			while(list1 != null && list2 != null ){
				if(list1.val <= list2.val){
					cur.next = list1;
					list1 = list1.next;
				} else {
					cur.next = list2;
					list2 = list2.next;
				}
				cur = cur.next;
			}
			if(list1 == null){
				cur.next = list2;
			} else {
				cur.next = list1;
			}
			return temp.next;
    	}
    }

	public static void main(String[] args) {
		int[] list1 = {1,2,4};
		int[] list2 = {1,3,4};
		Node newList = Node.mergeTwoLists(list1, list2);
	}
}
