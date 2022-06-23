Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
  
  ==============================
  
  
class Solution {
    
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
       int n = text2.length();
        int[][] memo = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                memo[i][j]=-1;
            }
        }
       return longestCommonSubsequence(text1,text2,m,n,memo);
        
        
    }
    public int longestCommonSubsequence(String text1, String text2 , int m, int n , int[][] memo){
      
        if(memo[m][n]!=-1){
            return memo[m][n];
        }
        if(m==0 || n==0) {
            memo[m][n]=0;
        }else{
            if(text1.charAt(m-1)==text2.charAt(n-1)){
                memo[m][n]=1+longestCommonSubsequence(text1,text2,m-1,n-1,memo);
            }else{
                memo[m][n]=Math.max(longestCommonSubsequence(text1,text2,m-1,n,memo),longestCommonSubsequence(text1,text2,m,n-1,memo));
            }
        }
        return memo[m][n];
    }
}
