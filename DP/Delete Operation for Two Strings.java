Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.

In one step, you can delete exactly one character in either string.

 

Example 1:

Input: word1 = "sea", word2 = "eat"
Output: 2
Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
Example 2:

Input: word1 = "leetcode", word2 = "etco"
Output: 4
=======================================  
class Solution {
    public int minDistance(String word1, String word2) {
        int len = lcs(word1,word2);
        return word1.length()+word2.length()-2*len;
    }
    public int lcs(String n1, String n2){
        int[][] dp = new int[n1.length()+1][n2.length()+1];
        for(int i=0;i<=n1.length();i++){
            for(int j=0;j<=n2.length();j++){
                if(i==0 || j==0){
                    continue;
                }
                if(n1.charAt(i-1)==n2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n1.length()][n2.length()];
    }
}
