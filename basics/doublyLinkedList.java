package basics;

public class doublyLinkedList {
	Node head;

	static class Node {
		int data;
		Node prev;
		Node next;
		public Node (int d){
			data = d;
			prev = null;
			next = null;
		}
	}

	private void printDll() {
		Node n = head;
		Node last = n;
		while(n.next != null){
			if(n.prev == null){
				System.out.println("nul <- "+n.data+" -> "+ n.next.data);
			}
			else{
				System.out.println(n.prev.data+" <- "+n.data+" -> "+ n.next.data);
			}
			n = n.next;
			last = n;
		}
		System.out.println(last.prev.data+" <- "+last.data+" -> nul");
	}

	public static void main(String[] args) {
		doublyLinkedList dll = new doublyLinkedList();
		dll.head = new Node(10);
		Node second = new Node(20);
		dll.head.prev = null;
		dll.head.next = second;
		second.prev = dll.head;

		Node third = new Node(30);
		second.next = third;
		third.prev = second;

		Node forth = new Node(40);
		forth.prev = third;
		third.next = forth;
		forth.next = null;
		
		dll.printDll();
	}

}
