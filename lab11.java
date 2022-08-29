public class lab11 {
	public static void bsort(int arr[]){
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
		int arr[] = {4,6,1,3,9,6,8,7,2};
		bsort(arr);
		int res = rec_b_search(arr, 0, arr.length-1, 6);
		if(res==-1){
			System.out.println("element not found");
		}
		else System.out.println("element found at index "+ res);
	}
}
