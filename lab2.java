import java.util.Scanner;

public class lab2 {
	public static void isort(int arr[]) {
		int size = arr.length;
		for(int itr = 1;itr<size;itr++){
			int cur =arr[itr];
			int itr2= itr-1;
			while(itr2>=0 && cur<arr[itr2]){
				arr[itr2+1]=arr[itr2];
				itr2--;
			}
			arr[itr2+1]=cur;
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
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		isort(arr);
		int key = sc.nextInt();
		int idx = bsearch(arr, key);
		if(idx!=-1){
			System.out.println("the element found at index "+ idx);
		}
		else{
			System.out.println("element not found");
		}
		sc.close();
	}
}
