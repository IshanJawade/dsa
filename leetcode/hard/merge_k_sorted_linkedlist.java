package leetcode.hard;

import java.util.*;

public class merge_k_sorted_linkedlist {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        // slightly faster
        public static ListNode mergeKLists(ListNode[] lists) {
            // edge cases
            if(lists == null || lists.length == 0) return null;

            PriorityQueue<ListNode> sortedList = new PriorityQueue<>((a,b)->a.val - b.val);
            // add all nodes into Priority Queue
            for (ListNode node : lists) {
                while(node != null){
                    sortedList.add(node);
                    node = node.next;
                }
            }
            // create a  new sorted linked list
            ListNode dummy = new ListNode();
            ListNode ptr = dummy;
            
            while(!sortedList.isEmpty()){
                ptr.next = sortedList.poll();
                ptr = ptr.next;
            }
            // ensure linked list last node points to null
            ptr.next = null;
            return dummy.next;
        }
        
        // accepted 
        public static ListNode mergeKListsBrut(ListNode[] lists) {
            // add values of nodes in array
            ArrayList <Integer> nums = new ArrayList<>();
            for (ListNode node : lists) {
                while(node != null){
                    nums.add(node.val);
                    node = node.next;
                }
            }
            // sort the array
            nums.sort((a,b) -> a-b);

            ListNode dummy = new ListNode();
            ListNode ptr = dummy;
            for (Integer num : nums) {
                ptr.next = new ListNode(num);
                ptr = ptr.next;
            }
            return dummy.next;
        }

    }

    public static void main(String[] args) {
        
    }
}
