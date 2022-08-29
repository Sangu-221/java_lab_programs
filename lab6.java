public class lab6 {
	public static void main(String[] args) {
		queue q = new queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.display();
	}
}
class queue{
	Node front=null;
	Node rear = null;
	int count = 0;
	public class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null;
		}
	}
	public void enqueue(int elem) {
		Node t = new Node(elem);
		if(front==null){
			front=t;
			rear=t;
			count++;
			System.out.println("Element "+elem+" is inserted at first position.. ");
		}
		else{
			rear.next=t;
			rear = t;
			System.out.println("Element "+elem+" is inserted at Rear end..");
			count++;
		}
		
	}
	public int dequeue() {
		if(front == null){
			System.out.println("Queue is empty...cannot delete.");
			return-1;
		}
		int del = front.data;
		if(front==rear){
			front=null;
			rear=null;
			count--;
			System.out.println("Element "+del+" is deleted at Front end..");
			System.out.println("The Queue is now empty");
			return del;
		}
		front = front.next;
		count--;
		System.out.println("Element "+del+" is deleted at Front end..");
		return del;
	}
	public int front() {
		if(front==null){
			System.out.println("The list is empty..");
			return -1;
		}
		return front.data;
	}
	public int rear(){
		if(front==null){
			System.out.println("The list is empty..");
			return -1;
		}
		return rear.data;
	}
	public int size(){
		return count;
	}
	public void display() {
		Node itr = front;
		if(front==null){
		    System.out.println("Queue is empty...No elements to display.");
		    return;
		}
		System.out.print("\n Front-->{ ");
		while(itr!=null){
		    if(itr.next==null){
		        System.out.print(itr.data);
		        break;
		    }
		    System.out.print(itr.data + " , ");
			itr= itr.next;
		}
		System.out.println(" }<--Rear");
		return;
	}
}