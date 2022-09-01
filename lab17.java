public class lab17 {
	public static void main(String[] args) {
		deque dq = new deque();
		dq.enqueueLast(2);
		dq.enqueueLast(3);
		dq.enqueueLast(4);
		dq.enqueueLast(6);
		dq.display();
		dq.dequeueLast();
		dq.enqueueLast(5);
		dq.enqueueLast(6);
		dq.enqueueFirst(1);
		System.out.println(dq.isEmpty());
		dq.display();

	}
}

class deque{
	class Node{
		int data ;
		Node next;
		Node(int value){
			this.data = value;
			this.next = null;
		}
	}
	Node front;
	Node rear;
	int length;
	deque(){
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	public void enqueueFirst(int elem){
		Node t = new Node(elem);
		if(front == null){
			front = rear = t;
			length++;
			return;
		}
		else{
			t.next = front;
			front = t;
			length++;
		}
	}
	public void enqueueLast(int elem) {
		Node t = new Node(elem);
		if(front == null){
			front = rear = t;
			length++;

		}
		else{
			rear.next = t;
			rear = t;
			length++;

		}
	}
	public int dequeueFirst() {	
		if(front == null){
			System.out.println("the queue has no elements...");
			return -404;
		}
		int data = front.data;
		if(front == rear){
			front = rear = null;
			length--;
			return data;
		}
		front = front.next;
		length--;
		return data;
	}
	public int dequeueLast() {
		if(front == null){
			System.out.println("the Queue is empty..cannot delete...");
			return -404;
		}
		int data = rear.data;
		if(front == rear){
			front = rear = null;
			length--;
			return data;
		}
		Node itr = front;
		while(itr.next!=rear){
			itr = itr.next;
		}
		itr.next = null;
		rear = itr;
		length--;
		return data;

	}
	public boolean isEmpty() {
	 if(length == 0){
		return true;
	 }
	 else{return false;}
	}
	public void display() {
		Node itr = front;
		while(itr!=null){
			System.out.print(itr.data + " ");
			itr = itr.next;
		}
	}
}