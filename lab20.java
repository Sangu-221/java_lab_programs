import java.util.Scanner;
public class lab20 {
	public static void bsort(String arr[]){
		int size = arr.length;
		for(int i=1;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(arr[j].compareTo(arr[j+1])>0){
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}	
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
		bsort(arr);
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
