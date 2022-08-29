public class lab5 {
	public static void main(String[] args) {
		stack st = new stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.pop();
		st.print(st.start);
	}
}
class stack{
	Node top =null;
	Node start = null;
	class Node{
		int data;
		Node next;
		Node(int val){
			this.data = val;
			this.next = null;
		}
	}
	public boolean isEmpty() {
		if(top == null){
			return true;
		}
		else{
			return false;
		}
	}
	public void push(int elem) {
		Node t = new Node(elem);
		if(top == null){
			start = t;
			top= t;
		}
		else{
			top.next = t;
			top = t;
		}
		
	}
	public int pop() {
		int data = top.data;
		if(isEmpty()){
			System.out.println("stack is empty..");
			return -1;
		}
		else if(top == start) {
			start = top = null;
		}
		else{
			Node itr = start;
			while(itr.next!=top){
				itr = itr.next;
			}
			itr.next = null;
			top = itr;
		}
		return data;
	}

	public void print(Node temp ) {
		if(temp==null){
			return;
		}
		print(temp.next);
		System.out.print(temp.data + " ");
	}
	
}
