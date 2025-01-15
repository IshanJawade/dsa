package leetcode.easy;

class Node{
	int val;
	Node next;

	// constructor fo Node class
	public Node(int d){
		this.val = d;
		this.next = null;
	}
	public static Node reverseList(Node head) {
		Node current = head;
		Node next = null;
		Node prev = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
        return prev;
    }
}

public class reverse_linkedlist {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node n2 = new Node(2);
		head.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		Node n4 = new Node(4);
		n3.next = n4;
		Node n5 = new Node(5);
		n4.next = n5;
		
		head = Node.reverseList(head);
	}
}
