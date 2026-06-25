class IsPlaindromewithoutspecialcharacters{
	static Boolean isPlaindromewithoutspecialcharacters(String str){
		int l =0;
		int r = str.length()-1;

		while(l<r){
			while(l<r && !Character.isLetterOrDigit(str.charAt(l))) l++;
			while(l<r && !Character.isLetterOrDigit(str.charAt(r))) r--;
			if(Character.isLowerCase(str.charAt(l)) != Character.isLowerCase(str.charAt(r))){
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
	public static void main(String[] args){
		String str = "a12345b<>?b>>?a";
		System.out.println(isPlaindromewithoutspecialcharacters(str));
	}
}
