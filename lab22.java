import java.util.Scanner;
public class lab22 {
	public static void isort(String arr[]) {
		int size = arr.length;
		for(int itr = 1;itr<size;itr++){
			String cur =arr[itr];
			int itr2= itr-1;
			while(itr2>=0 && cur.compareTo(arr[itr2])<0){
				arr[itr2+1]=arr[itr2];
				itr2--;
			}
			arr[itr2+1]=cur;
		}
	}
	public static int bsearch(String arr[],String key){
	
		int lb=0;
		int ub =arr.length - 1;
		while(lb<=ub){
			int mid = (lb+ub)/2;
			if(arr[mid].equals(key)){
				return mid;
			}
			else if(key.compareTo(arr[mid])<0){
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
		System.out.println("Enter the strings.... ");
		String arr[] = new String[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.next();
		}
		isort(arr);
		System.out.println("Enter the key value to be searched--> ");
		String key = sc.next();
		int pos = bsearch(arr,key);
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
