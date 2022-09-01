import java.util.Scanner;

public class lab15 {
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
	public static int bsearch(int arr[],int key){
	
		int lb=0;
		int ub =arr.length - 1;
		while(lb<=ub){
			int mid = (lb+ub)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if(key<arr[mid]){
				ub=mid-1;
			}
			else{
				lb=mid+1;
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
		selection_sort(arr, n);
		System.out.println("Enter the key value to be searched--> ");
		int key = sc.nextInt();
		int pos = bsearch(arr, key);
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
