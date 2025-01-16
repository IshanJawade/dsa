package leetcode.medium;

class ListNode{
    int val;
    ListNode next;
    //reverse the given linked list 
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public static void reorderList(ListNode head) {
        // to store the reverse of the list
        ListNode revList = new ListNode();
        revList = reverseList(head);
        ListNode cur = head; 
        while(cur!=null){
            cur.val
        }
    }
}

public class reorder_linkedlist {
    
    public static void main(String[] args) {
       
    }
}
