class RotatedSortedarrayWithDuplicate{
	static int rotatedSortedarrayWithDuplicate(int[] arr, int target){
		int l = 0;
		int r = arr.length-1;
		while(l<=r){
			int mid = l + (r-l)/2;
			if(arr[mid] == target) return mid;
			
			//only this condition is needed if the array has duplicates
			if(arr[l] ==arr[mid] && arr[mid] == arr[r]){
				l++;
				r--;
			}
			
			if(arr[l] <= arr[mid]){
				if(arr[l] <=target && target<arr[mid]){
					r = mid-1;
				}
				else{
					l = mid+1;
				}
			}
			else{
				if(arr[mid]<target && target<=arr[r]){
					l = mid+1;
				}
				else{
					r = mid-1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int[] arr = {4,4,5,5,6,7,7,1,1,2,2,2,3,3};
		int r = rotatedSortedarrayWithDuplicate(arr, 2);
		System.out.println(r);
	}
}
