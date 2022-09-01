import java.util.Scanner;
public class lab19 {
	public static void main(String[] args) {
        stack st = new stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements to be inserted : ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++){
			st.push(sc.nextInt());
		}
		st.print();
        sc.close();
    } 
}
class stack{
	Node top = null;
	Node stack = null;
	public class Node{
		int data;
		Node next;
		Node previous;
		Node(int elem){
			data = elem;
			next = null;
			previous = null;
		}
	}
	public void push(int elem) {
		Node t = new Node(elem);
		if(top==null){
			top=t;
			stack=t;
		}
		else{
			top.previous = t;
			t.next = top;
			top=t;
		}
	}
	public int peek() {
		if(top==null){
			System.out.println("The stack is empty...");
			return -404;
		}
		return top.data;
	}
	public int  pop() {
		if(top == null){
			System.out.println("stack underflow..");
			return -1;

		}
		int del = top.data;
		top=top.next;
		top.previous = null;
		return del;
	}
	public boolean isEmpty() {
		if(top==null)return true;
		else return false;
	}
	public void print() {
		if(top==null){
			System.out.println("the stack is empty...");
			return;
		}
		Node itr = top;
		while(itr!=null){
			System.out.println(itr.data);
			itr = itr.next;
		}
		
	}
	public int len() {
		if(top==null){		
			return 0;
		}
		Node itr = top;
		int count =0;
		while(itr!=null){
			count++;
			itr = itr.next;
		}
		return count;
	}
}