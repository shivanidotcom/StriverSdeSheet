class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // sorting 
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1],b[1]));
        int res = 1;
        int prev = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=prev){
                res++;
                prev = intervals[i][1];
            }
        }
        return intervals.length-res;
    }
}
