public class lab26 {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	public static Node insert(Node root,int val){
		if(root == null){
			root = new Node(val);
			return root;
		}
		if(root.data > val){
			root.left  = insert(root.left, val);
		}
		else{
			root.right = insert(root.right, val);
		}
		return root;
	}
	public static void inorder(Node root) {
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	public static void preorder(Node root) {
		if(root == null){
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(Node root) {
		if(root == null){
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	public static void main(String[] args) {
		int arr[] = {5,9,2,4,1,8,3,6,7};
		Node root = null;
		for(int i = 0;i<arr.length;i++){
			root = insert(root, arr[i]);
		}
		System.out.print("Inorder--> ");
		inorder(root);
		System.out.println();
		System.out.print("Preorder--> ");
		preorder(root);
		System.out.println();
		System.out.print("Postorder--> ");
		postorder(root);
	}
}