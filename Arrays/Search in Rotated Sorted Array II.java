class Solution {
    public boolean search(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:nums){
            if(i==target){
                return true;
            }
        }
        return false;
    }
}
