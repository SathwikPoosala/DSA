class Unique{
	static int unique(int[] arr){
		int l = 1;
		int r = 1;
		while(r<arr.length){
			if(arr[r] != arr[r-1]){
				arr[l] = arr[r];
				l++;
			}
			r++;
		}
		return l;
	}

	public static void main(String[] args){
		int[] arr = {1,1,2,2,2,3,3,3,3};
		int r = unique(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Res : " + r);
	}
}
