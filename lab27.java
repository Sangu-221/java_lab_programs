import java.util.Scanner;
public class lab27 {
	static class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data = data;
		}
	}
	public static Node insert(Node root,int val) {
		Node newNode = new Node(val);
		Node cur = root;
		Node prev = null;
		if(cur == null){
			root = newNode;
			return root;
		}
		while(cur!=null){
			prev = cur;
			if(cur.data>val){
				cur = cur.left;
			}
			else{
				cur = cur.right;
			}
		}		
		if(newNode.data < prev.data){
			prev.left = newNode;
		}
		else{
			prev.right = newNode;
		}
		return root;
	}
	public static void rSearch(Node root,int val) {
		if(root == null){
			System.out.println("search unsuccesfull....");
			return;
		}
		if(root.data == val){
			System.out.println("search succesfull..");
			return;
		}
		else if(val>root.data){
			rSearch(root.right, val);
		}
		else{
			rSearch(root.left, val);
		}
	}
	public static void nrSearch(Node root,int val) {
		if(root == null){
			System.out.println("no elements in tree...");
			return;
		}
		while(root!=null){
			if(root.data == val){
				System.out.println("search succesfull..");
				return;
			}
			else if(val < root.data){
				root = root.left;
			}
			else{
				root = root.right;
			}
		}
		System.out.println("search unsuccesfull...");
	}
	public static void inorder(Node root) {
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	public static void main(String[] args) {
		int arr[] = {5,9,2,4,1,8,3,6,7};
		Node root = null;
		for(int i = 0;i<arr.length;i++){
			root = insert(root, arr[i]);
		}
		System.out.print("Inorder--> ");
		inorder(root);
		System.out.println("enter the num to search...");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		nrSearch(root, val);
	}
}
