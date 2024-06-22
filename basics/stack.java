package basics;

public class stack{

	int top = -1;
	int size = 10;
	int arr[] = new int[size];
 
	public boolean isEmpty(){
		return top == -1;
	}

	public boolean isFull(){
		return top == (size -1);
	}

	public void push(int a){
		if(!isFull()){
			top++;
			arr[top] = a;
		} else {
			System.out.println("Cannot perfrom push, Stack is full!");
		}
	}

	public void pop(){
		if(!isEmpty()){
			top = top-1;
		} else {
			System.out.println("Cannot perfrom pop, Stack is empty!");
		}
	}

	public void peek(){
		if (top == -1){System.out.println("Stack is empty");}
		else{
			System.out.println(arr[top]);
		}
	}

	public static void main(String[] args){
		stack s = new stack();

		s.push(30);
		s.push(40);
		s.push(50);
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		s.peek();

	}
}