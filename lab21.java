import java.util.Scanner;
public class lab21 {
	public static void selection_sort(String arr[],int n){
		for(int i=0;i<n-1;i++){
			int mini = i;
			for(int j = i+1;j<n;j++){
				if(arr[mini].compareTo(arr[j])>0){
					mini = j;
				}
			}
			String num = arr[mini];
			arr[mini] = arr[i];
			arr[i] = num;
		}
	}
	public static int rec_b_search(String arr[],int lb,int ub, String key) {
		if(lb<=ub){
			int mid = (lb+ub)/2;
			if(arr[mid].equals(key))return mid;
			else if(arr[mid].compareTo(key)>0)return rec_b_search(arr, lb, mid-1, key);
			else return rec_b_search(arr, mid+1, ub, key);
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements to be inserted--> ");
		int n = sc.nextInt();
		System.out.println("Enter the strings.... ");
		String arr[] = new String[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.next();
		}
		selection_sort(arr,n);
		System.out.println("Enter the key value to be searched--> ");
		String key = sc.next();
		int pos = rec_b_search(arr, 0, n-1, key);
		if(pos == -1){
			System.out.println("element not found...");
		}
		else{
			System.out.println("Element found at index : "+pos);
		}
		for(String i : arr){
			System.out.print(i+" ");
		}
		sc.close();
	}
}
