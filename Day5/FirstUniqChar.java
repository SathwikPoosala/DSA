class FirstUniqChar {
    public int firstUniqChar(String s) {
        int[] feq = new int[26];
        Arrays.fill(feq,0);
        for(int i =0;i<s.length();i++){
            feq[s.charAt(i)-'a']++;
        }
        for(int i =0;i<s.length();i++){
            if(feq[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}