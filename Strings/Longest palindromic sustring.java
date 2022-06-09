class Solution {
    int maxLen = 0;
     int start = 0, end = 0;
    public String longestPalindrome(String s) {
        if(s.length()==0) return "";       
        String res = "";     
        for(int i = 0 ;i < s.length() ; i ++){
            solve(s,i,i);
            solve(s,i,i+1);
     
        }
        return s.substring(start, end+1);
    }
    public void solve(String s, int l , int r){
         while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r - l +1 > maxLen){
                   
                    maxLen = r - l +1;
                    start = l;
                    end = r;
                }
                l --;
                r ++; 
            }
    }
}
