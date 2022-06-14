// simply a activity selection problem


class Solution {
    public int findMinArrowShots(int[][] points) {
        // greedy method --> activity selection method
        // sorting according to their end time
        if(points.length==0) return 0;
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        int res =1, prev = points[0][1];
        for(int i = 1 ;i< points.length;i++){
            if(points[i][0]>prev){
                res++;
                prev=points[i][1];
            }
        }
        return res;
   
    }
}
