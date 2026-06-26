import java.util.*;
class Anagram{
	static Boolean anagram(String str1, String str2){
		if(str1.length() != str2.length()) return false;
		int[] feq = new int[26];
		Arrays.fill(feq, 0);
		for(int i =0;i<str1.length();i++){
			feq[str1.charAt(i)-'a']++;
			feq[str2.charAt(i)-'a']--;
		}

		for(int i = 0;i<26;i++){
			if(feq[i] >0) return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		String str1 = "ajai";
		String str2 = "iaja";
		System.out.println(anagram(str1, str2));
	}
}
