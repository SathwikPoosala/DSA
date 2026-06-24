class FloorBinarySearch{
	static int floor(int[] arr, int target){
		int l = 0;
		int r = arr.length-1;
		int ans = -1;
		while(l<=r){
			int mid = l + (r-l)/2;
			if(arr[mid] < target){
				l = mid + 1;
				ans = mid;//floor
			}
			else{
				r = mid - 1;
				//if we want to find the ceil number then we have to 
				//write it here (ans = mid;)
			}
			
		}
		return arr[ans];
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,6,7,8,9,10};
		int r = floor(arr, 5);
		System.out.println(r);
	}
}