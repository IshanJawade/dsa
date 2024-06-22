package basics;

// Link List without collection framework

public class linkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data = d;
			next = null;
		}
	}

	public void printLl(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		linkedList ll = new linkedList();
		ll.head = new Node(25);
		Node second = new Node(03);
		ll.head.next = second;
		Node third = new Node(2000);
		second.next = third;
		ll.printLl();
	}
	
}
