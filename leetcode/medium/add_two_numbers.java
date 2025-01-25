package leetcode.medium;

public class add_two_numbers {
	class ListNode{
		int val;
		ListNode next;

		ListNode(int n){
			this.val = n;
			this.next = null;
		}

		public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode dummy = new ListNode(-1);
			ListNode cur = dummy;
			int carry = 0;

			// this while loop will run until every condition gets false
			while(l1 != null || l2 != null || carry > 0){
				int sum = carry;

				if(l1!= null){
					sum = sum + l1.val;
					l1= l1.next;
				}

				if(l2!=null){
					sum = sum + l2.val;
					l2 = l2.next;
				}
				// removes the last digit from sum and stored in carry (10 -> 1)
				carry = sum / 10;
				// stores last digit of the number in the new node
				cur.next = new ListNode(sum % 10);
				cur = cur.next;
			}
			return dummy.next;
		}
	}
	public static void main(String[] args) {

		ListNode.addTwoNumbers(null, null)
	}
}
