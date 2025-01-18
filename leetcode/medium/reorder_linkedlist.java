package leetcode.medium;

class ListNode{
    int val;
    ListNode next;
    
    public static void reorderList(ListNode head){
        // edge case 
        if (head == null) { return ;}

        // find the middle of the linked list
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;   // one step
            fast = fast.next.next;  // two steps
        }

        // reverse the second half of the list
        ListNode second = slow.next;
        slow.next = null;
        ListNode node = null;

        while(second != null){
            ListNode temp = second.next;
            second.next = node;
            node = second;
            second = temp;
        }

        // merge the two half lists
        ListNode first = head;
        second = node;

        while(second != null){
            ListNode temp1 = first.next, temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }        
    }

}
   


public class reorder_linkedlist {
    
    public static void main(String[] args) {
       
    }
}
