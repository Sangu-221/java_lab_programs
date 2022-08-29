public class lab10 {
	public static void m_sort(String arr[],int lb,int ub) {
		if(lb<ub){
			int mid = (lb+ub)/2;
			m_sort(arr, lb, mid);
			m_sort(arr, mid+1,ub);
			merge(arr,lb,mid,ub);
		}
		
	}
	public static void merge(String arr[],int lb,int mid,int ub) {
		int n = ub-lb+1;
		int i = lb;
		int j = mid+1;
		String t[] = new String [n];
		int k=0;
		while(i<=mid && j<=ub){
			if(arr[i].compareTo(arr[j])<0){
				t[k] = arr[i];
				k++;
				i++;
			}
			else{
				t[k] = arr[j];
				k++;
				j++;

			}
		}
			while(i<=mid){
				t[k]  =  arr[i];
				k++;i++;
			}
			while(j<=ub){
				t[k] = arr[j];
				k++;j++;
			}
		
		for(int r=0,l=lb;r<n;r++,l++){
			arr[l]=t[r];
		}
	}
	public static void main(String[] args) {
		String arr[] = {"raju","sai","aadhi","asdf","jkl;"};
		m_sort(arr, 0, arr.length - 1);
		for(int i= 0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}
