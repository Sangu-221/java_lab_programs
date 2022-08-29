public class lab8 {
	public static void qsort(int arr[],int lb, int ub) {
		if(lb<ub){
			int pos = partition(arr,lb, ub);
			qsort(arr, lb, pos-1);
			qsort(arr, pos+1, ub);
		}
		
	}
	public static int partition(int arr[],int lb,int ub) {
		int i = lb;
		int j = ub;
		int pivot = arr[lb];
		while(i<j){
			while(arr[i]<=pivot && i<j){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<j){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		arr[lb]=arr[j];
		arr[j]= pivot;
		return j;
	}
	public static void main(String[] args) {
		int arr[]={5,4,3,2,1};
		qsort(arr,0, arr.length-1);
		for(int i= 0 ; i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
