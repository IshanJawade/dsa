package leetcode.easy;

import java.util.*;

public class Linked_list_cycle {
	
	class ListNode {
		int val;
		ListNode next;
	    ListNode(int x) {
	         val = x;
	         next = null;
	    }

		static boolean hasCycles(ListNode head){
			Set<ListNode> visited = new HashSet<>();
			ListNode cur = head;
			while(cur !=null){
				if(visited.contains(cur)){
					return true;
				} else {
					visited.add(cur);
					cur = cur.next;
				}
			}
			return false;
		}

		static boolean hasCycleDumb(ListNode head) {
			Map<Integer, Integer> hmap = new HashMap<>();
			ListNode cur = head;
			int flag = 0;
			int count = 0;
			while(flag != 1){
				if(hmap.containsKey(count)){
					flag = 1;
					break;
				} else {
					hmap.put(count, cur.val);
					cur = cur.next;
				}
			}
			if(count < 1){
				return false;
			}
			if(flag == 1){
				return true;
			} else {
				return false;
			}
		}
	 }
	public static void main(String[] args) {
		
	}
}
