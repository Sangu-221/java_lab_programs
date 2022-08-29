import java.util.Scanner;

public class lab1 {
public void bsort(int arr[]){
	int size = arr.length;
	for(int i=1;i<size;i++){
		for(int j=0;j<size-1;j++){
			if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}

	}
}
public int bsearch(int arr[],int key){
	
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
	lab1 l = new lab1();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i = 0;i<n;i++){
		arr[i]= sc.nextInt();
	}
	l.bsort(arr);
	int key = sc.nextInt();
	int idx = l.bsearch(arr, key);
	if(idx!=-1){
		System.out.println("the element found at index "+ idx);
	}
	else{
		System.out.println("element not found");
	}
	sc.close();
}
	
}