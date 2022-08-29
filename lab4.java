import java.util.InputMismatchException; 
import java.util.Scanner;
public class lab4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the stack...");
		int val = sc.nextInt();
		stack st = new stack(val);
		System.out.println("Enter the elements ...");
		try{
			for(int i = 0 ;i<val;i++){
				st.push(sc.nextInt());
			}
		}
		catch(InputMismatchException e){
			// System.out.println("elements inserted....");
		}
		finally{
			System.out.println("elements inserted");
		}
		int itr = st.top;
		while(itr>=0){
			System.out.println(st.arr[itr]+ " ");
			itr--;
		}
		sc.close();
	}

}
class stack{
	int size=0;
	int top =-1;
	int  arr[];
	stack(int val){
		this.size = val;
		this.arr= new int[size];
	}
	public boolean isEmpty() {
		if(top == -1){
			return true;
		}
		else{
			return false;
		}
	}
	public void push(int elem) {
		if(top == size-1){
			System.out.println("stack is full");
		}
		else{
			top+=1;
			arr[top]=elem;
		}
		
	}
	public int pop() {
		if(isEmpty()){
			System.out.println("stack is empty..");
			return -1;
		}
		else{
			int data = arr[top];
			top-=1;
			return data;
		}
	}
	public boolean isFull(){
		if(top == size-1){
			return true;
		}
		else{
			return false;
		}
	}
}
