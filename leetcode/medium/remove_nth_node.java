package leetcode.medium;

public class remove_nth_node {

    class ListNode{
        int val;
        ListNode next;

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode current = head;
            int count = 0;
            while(current != null){
                count++;
            }
            int stopNode = count - n;

            current =head;
            count = 0;
            ListNode prev = null;
            ListNode temp = null;
            while(current != null){
                if(count == stopNode){
                    prev = current;
                    prev.next = current.next.next;
                    break;
                }
                count++;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        
    }
}
