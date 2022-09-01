import java.util.Scanner;
public class lab25 {
	public static int rec_linear_search(int arr[],int lb,int ub,int key) {
		if(lb>ub){
			return -1;
		}
		if(arr[lb] == key){
			return lb;
		}
		else{
			lb++;
			return rec_linear_search(arr, lb, ub, key);
		}
	}
	public static int linear_search(int arr[],int key) {
		int n = arr.length;
		for(int i= 0;i<n;i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements to be inserted--> ");
		int n = sc.nextInt();
		System.out.println("Enter the elements.... ");
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key value to be searched--> ");
		int key = sc.nextInt();
		int pos = rec_linear_search(arr, 0, n-1, key);
		if(pos == -1){
			System.out.println("element not found...");
		}
		else{
			System.out.println("Element found at index : "+pos);
		}
		for(int i : arr){
			System.out.print(i+" ");
		}
		sc.close();
	}
}
