package leetcode.medium;

public class remove_nth_node {

    class ListNode{
        int val;
        ListNode next;

        // optimized solution (Two pointer method)
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // using dummy node to overcome eadge cases
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast  = dummy;
            ListNode slow  = dummy;

            for(int i=0; i<n; i++){
                fast = fast.next;
            }
            // moving fast one step ahead (can't do it in the loop)
            fast = fast.next;

            while(fast != null){
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            // returning dummy.next node because of first step
            return dummy.next;
        }

        // brut force solution but still worked 100%
        public ListNode removeNthFromEndbr(ListNode head, int n) {
            ListNode current = head;
            int count = 0;

            // count the number of nodes
            while(current != null){
                count++;
                current = current.next;
            }
            // where to stop for deletion (one node before)
            int stopNode = count - n;

            // edge cases
            if (n > count) return head;
            if(stopNode == 0){
                return head.next;
            }

            current = head;
            count = 0;
            ListNode prev = null;

            //trverse till the one node before deletion node
            while(count < stopNode){
               prev = current;
               current = current.next;
               count++;
            }

            //skip the node and link the next node (deletion)
            prev.next = current.next;

            return head;
        }
    }

    public static void main(String[] args) {
        
    }
}
