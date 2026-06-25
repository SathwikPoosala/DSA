import java.util.*;
class Frequency{
	static void frequency(String str){
		int n = str.length();
		int[] arr = new int[26];
		Arrays.fill(arr,0);
		for(int i =0;i<n;i++){
			arr[str.charAt(i)-'a']++;
		}
		
		for(int i = 0;i<26;i++){
			if(arr[i]>0){
				System.out.print((char)('a'+i)+""+arr[i]);
			}
		}
	}

	public static void main(String[] args){
		String str = "aaabbccdddee";
		frequency(str);
	}
}
