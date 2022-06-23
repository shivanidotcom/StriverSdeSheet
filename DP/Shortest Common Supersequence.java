Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences. If there are multiple valid strings, return any of them.

A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s.

 

Example 1:

Input: str1 = "abac", str2 = "cab"
Output: "cabac"
Explanation: 
str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
The answer provided is the shortest such string that satisfies these properties.
  
  ==========================================
  
  
class Solution {
    public int longestSS(String str1,String str2,int m,int n,int[][] dp){
        int n1 = str1.length();
        int n2 = str2.length();
       // int[][] dp = new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                if(i==0 || j==0){
                    continue;
                }
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();
        int[][] dp = new int[m+1][n+1];
        int lcs=longestSS(str1,str2,m,n,dp);
        System.out.println(lcs+" longest ss");
        int i=m,j=n;
        String ans = "";
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                ans+=str1.charAt(i-1);
                i--;
                j--;
            }else{
                if(dp[i-1][j]>dp[i][j-1]){
                    ans+=str1.charAt(i-1);
                    i--;
                }else
                {
                    ans+=str2.charAt(j-1);
                    j--;
                }
            }
        }
        // to add remaining characters
        while(i>0){
            ans+=str1.charAt(i-1);
            i--;
        }
        while(j>0){
            ans+=str2.charAt(j-1);
            j--;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ans);
        sb.reverse();
        return sb.toString();
    }
}
