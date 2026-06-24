class BinarySearch{
	static int binarySearch(int[] arr, int target){
		int l = 0;
		int r = arr.length-1;
		while(l<=r){
			int mid = l + (r-l)/2;
			if(arr[mid] == target) return mid;
			else if(arr[mid] < target){
				l = mid+1;
			}
			else{
				r = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,10,11,15,16,19};
		int r = binarySearch(arr, 19);
		System.out.println(r);
	}
}
