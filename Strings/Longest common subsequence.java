class Solution {
    public int longestPalindromeSubseq(String s) {
        int n =s.length();
        int[][] arr = new int[n][n];
        //we initially fill with 1
        for(int i=0;i<n;i++){
            arr[i][i]=1;
        }
        for(int l = 2; l <= n; l++){
            for(int i = 0; i <= n - l; i++){
                int j = l + i - 1;
                if(s.charAt(i) == s.charAt(j)){
                    arr[i][j] = 2 + arr[i + 1][j - 1];
                } else {
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j - 1]);
                }
            }
        }
        return arr[0][n-1];
    }
}
