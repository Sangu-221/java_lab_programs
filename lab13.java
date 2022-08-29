import java.util.InputMismatchException;
import java.util.Scanner;
public class lab13 {
	Node head = null;
	Node tail = null;
	public class Node {
		int data;
        Node next;
		Node previous;
        Node(int value){
            data=value;
            next=null;
			previous=null;
        }
	}
	public void insert(int data) {
	Node t = new Node(data);
	if(head==null){
		head =tail = t;
	}
	else{
		tail.next=t;
		t.previous=tail;
		tail=t;
	}
	}
	public void delete(int elem) {
		if(head==null){
			System.out.println("The list is empty...cannot delete an element");
			return;
		}
		
	if(head.data==elem){
		if(head==tail){
			head=tail=null;
			System.out.println("Note: The list is now empty...");
			return;
		}
		head.next.previous=null;
		head=head.next;
		return;
	}
	Node itr =head;
	while(itr!=null && itr.next.data!=elem){
		itr=itr.next;
		}
	if(itr==null){
		System.out.print("\n Element not found...");
		return;
	}		
	if(itr.next==tail){
		itr.next=null;
		tail=itr;
		return;
	}
	itr.next.next.previous=itr;
	itr.next = itr.next.next;	
	}

	public void printlist() {
	if(head==null){
		System.out.println("Oops!!..linkedlist is empty...");
		return;
	}
	Node itr =head;
	while(itr!=null){
		if(itr.next==null){
			System.out.println(itr.data);
			return;
		}
		System.out.print(itr.data+"<->");
		itr=itr.next;
		
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		lab13 dl = new lab13();
		System.out.println("Enter the list of elements and enter any other charecter to stop -->");
		boolean flag = true;
		try{
			while(flag){
			    int val = sc.nextInt();
				dl.insert(val);
			}
		}
		catch(InputMismatchException e){
			// System.out.println("elements inserted....");
			flag = false;
		}
		finally{
			System.out.println("elements inserted");
		}
		dl.printlist();
		dl.delete(3);
		System.out.println("\nElements after deletion : ");
		dl.printlist();
	}
}
