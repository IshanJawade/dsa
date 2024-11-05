package basics;


public class queue {

	int arr[] = new int[11];
	int front = 0;
	int rear = 0;
	
	public void enqueue(int a){
		if((rear == arr.length -1)){
			System.out.println("Queue is full! Can't perform enqueue.");
		}
		else{
			arr[rear] = a;
			rear++ ;
		}
	}

	public void dequeue(){
		if (front == rear) { 
			System.out.println("Can't perform dequeue on empty queue.");
		}
		else{
			front++ ;
		}
	}

	public void showqueue(){
		if (front == rear){
			System.out.println("The queue is empty.");
		}
		else{
			for(int i=front; i< rear; i++){
				System.out.print(arr[i]);
			}	
			System.out.println();
		}
	}

	public static void main(String[] args) {
		queue q = new queue();
		q.enqueue(1); 
		q.enqueue(2); 
		q.enqueue(3); 
		q.enqueue(4); 
		q.enqueue(5); 
		q.enqueue(6); 
		q.enqueue(7); 
		q.enqueue(8); 
		q.enqueue(9); 
		q.enqueue(10);
		q.enqueue(11);
		q.showqueue(); 
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.showqueue(); 
	}
}