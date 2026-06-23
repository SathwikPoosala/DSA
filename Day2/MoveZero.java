class MoveZero{
	static void movezero(int[] arr){
		int l = 0;
		int r = 0;
		while(r<arr.length){
			if(arr[r] != 0){
		//instead of swapping we can just write arr[l] = arr[r];l++; and after this loop we should write a while loop to update the last values to zero
				int temp = arr[l]; 
				arr[l] = arr[r]; 
				arr[r] = temp;
				l++;
			}
			r++;
		}
		//this is the loop we will be using if don't swap above
		//while(l<arr.length){
		//	arr[l] = 0;
		//	l++;
		//}
	}
	public static void main(String[] args){
		int[] arr = {1,0,2,0,3,0,4,5};
		movezero(arr);
	}
}
