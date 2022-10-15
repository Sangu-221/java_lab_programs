public class lab28 {
	static class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static Node buildBT(Node root,int [] arr,int i ) {
		if(i<arr.length)
		{
			if(root == null){
				if(arr[i] == -1){
					root = null;
					return root;
				}
				root = new Node(arr[i]);
		
			}
			root.left = buildBT(root.left, arr, 2*i+1);
			root.right = buildBT(root.right, arr, 2*i+2);
			return root;
		}
		return null;
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
		int arr[] = {5,9,7,-1,3,2,1,-1,-1,8,6,-1,-1,-1,4};
		Node root = null;
		for(int i = 0;i<arr.length;i++){
			root = buildBT(root, arr,0);
		}
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
	}
}
