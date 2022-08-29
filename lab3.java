public class lab3 {
	Node head = null;
	Node tail = null;
	public class Node{
		int data;
		Node next;
		Node(int elem){
			this.data = elem;
			this.next = null;
		}
	}
	public void insert(int data) {
		Node t = new Node(data);
		if(head == null){
			head  = t;
			tail = t;
		}
		else{
			tail.next = t;
			tail = t;
		}
	}
	public void delete(int key){
		if(head == null){
			System.out.println("the list is empty...");

		}
		if(head.data == key){
			if(head==tail){
				head = tail = null;
				System.out.println("the list is now empty...");
				return;
			}
			else{
				head = head.next;
				Node ptr=head;
		while(ptr!=null){
			System.out.println(ptr.data + " ");
			ptr =ptr.next;
		}
		return;
			}
		}
		Node itr = head;
		while(itr!=tail && itr.next.data!=key){
			itr=itr.next;
		}
		if(itr==tail){
			System.out.println("element not found to delete...");

		}
		itr.next = itr.next.next;
		itr=head;
		while(itr!=null){
			System.out.println(itr.data + " ");
			itr =itr.next;
		}
	}
	public void print() {
		Node itr=head;
		while(itr!=null){
			System.out.println(itr.data + " ");
			itr = itr.next;
		}
	}
	public static void main(String[] args) {
		lab3 l = new lab3();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.delete(1);
	}
}
