class FirstOccurence{
	static int firstOccurence(int[] arr, int target){
		int l = 0;
		int r = arr.length-1;
		int ans = -1;
		while(l<=r){
			int mid = l+(r-l)/2;
			if(arr[mid] == target){
				ans = mid;
				r = mid-1;
			}
			else if(arr[mid] < target){
				l = mid+1;
			}
			else{  
				r = mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args){
		int[] arr = {1,1,2,2,2,3,3,4,4,4,4};
		int r = firstOccurence(arr, 4);
		System.out.println(r);
	}
}