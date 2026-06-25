class MinimumInRotatedSortedArray{
	static int minimumInRotatedSortedArray(int[] arr){
		int l = 0;
		int r = arr.length-1;
		int min = Integer.MAX_VALUE;

		while(l<=r){
			int mid = l+(r-l)/2;
			
			if(arr[mid] < min) min = arr[mid];
		
			if(arr[mid] > arr[r]){
				l = mid+1;
			}
			else{
				r = mid-1;
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		int[] arr = {4,5,6,7,8,0,1};
		int r = minimumInRotatedSortedArray(arr);
		System.out.println(r);
	}
}

