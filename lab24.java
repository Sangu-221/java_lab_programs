import java.util.Scanner;

public class lab24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the circular Queue : ");
		int n = sc.nextInt();
		circularQueue cq = new circularQueue(n);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.display();
		cq.dequeue();
		cq.dequeue();
		
		System.out.println("Is queue empty ? --> "+cq.isEmpty());
		cq.enqueue(9);
		System.out.println("Is queue full ? --> "+cq.isFull());
		cq.display();
		cq.enqueue(100);
		cq.display();
	}
}
class circularQueue{
	int SIZE;// SIZE  will be constant throught the program
	int front,rear;
	int arr[];
	circularQueue(int size){
		SIZE = size;
		front = -1;
		rear = -1;
		arr = new int[SIZE];
	}
	public boolean isFull() {
		if (front == 0 && rear == SIZE - 1) return true;
		if(front == rear+1) return true;
		return false;
	}
	public boolean isEmpty(){
		if(front == -1) return true;
		else return false;
	}
	public void enqueue(int elem) {
		if(isFull()){
			System.out.println("the Queue is full..Cannot insert.");
		}
		else{
			if(front == -1){
				front = 0;
			}
			rear = (rear+1)%SIZE;
			arr[rear] = elem;
		}
	}
	public int dequeue() {
		int data;
		if(isEmpty()){
			System.out.println("The Queue is empty..Cannot delete..");
			return -1;
		}
		else{
			data = arr[front];
			if(front == rear)   // if queue contains only one element..
			{  
				front = rear = -1;
			}
			else{
				front = (front+1)%SIZE;
			}
			return data;
		}
	}
	public void display() {
		if(isEmpty()){
			System.out.println("The Queue has no elements....");
			return;
		}
		int i;
		System.out.print("Front ---> { ");
		for(i = front;i!=rear;i = (i+1)%SIZE){
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[i]);
		System.out.println("} ---> Rear.");
	}
}