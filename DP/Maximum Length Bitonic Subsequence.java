class Solution {
    public int minimumMountainRemovals(int[] nums) {
        // this is the varition of lis -> maximum length of bitnoic subsequence
        int n = nums.length;
        if(n>3){
            // not a binary search solution
            int[] lis = new int[n];
            int[] lds=new int[n];
            // lis construction
            for (int i = 0; i < n; i++){
            int max = 1;
            for (int j = 0;j <i; j++){
                if (nums[j] < nums[i]){
                        max = Math.max(max, lis[j] + 1);
                    }
               }
                lis[i] = max;
           }
            // lds construction
            for (int i = n-1; i >= 0; i--){
                int max = 1;
                for (int j = i+1; j < n; j++){
                    if (nums[i] > nums[j]){
                        max = Math.max(max, lds[j]+ 1);
                    }
                }
                lds[i] = max;
             }
            // maximum of lis[i]+lds[i]-1 is the length of the bitonic subsequence
            int res=0;
            for(int i=0;i<n;i++){
                if(lis[i]>1 && lds[i]>1){
                    res=Math.max(res,lis[i]+lds[i]);
                }
            }
            return n-(res-1);
        }
        return 0;
    }
}
