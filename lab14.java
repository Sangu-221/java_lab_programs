import java.util.Scanner;

public class lab14 {
	public static void selection_sort(int arr[],int n){
		for(int i=0;i<n-1;i++){
			int mini = i;
			for(int j = i+1;j<n;j++){
				if(arr[mini]>arr[j]){
					mini = j;
				}
			}
			int num = arr[mini];
			arr[mini] = arr[i];
			arr[i] = num;
		}
	}
	public static int rec_b_search(int arr[],int lb,int ub, int key) {
		if(lb<=ub){
			int mid = (lb+ub)/2;
			if(arr[mid] == key)return mid;
			else if(arr[mid]>key)return rec_b_search(arr, lb, mid-1, key);
			else return rec_b_search(arr, mid+1, ub, key);
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
		selection_sort(arr, n);
		System.out.println("Enter the key value to be searched--> ");
		int key = sc.nextInt();
		int pos = rec_b_search(arr, 0, n-1, key);
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
