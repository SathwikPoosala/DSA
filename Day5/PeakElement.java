class PeakElement{
    static int peakElement(int[] arr){
        int n = arr.length;
        if(n==1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;
        int l =0;int r = n-1;
        while(l<r){
            int mid = l+ (r-l)/2;
            if(arr[mid] >arr[mid+1]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
    
    public static void main(String[] args){
        int[] arr = {6,1,2,3,4,5,1};
        System.out.println(peakElement(arr));
    }
}
