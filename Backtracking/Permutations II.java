Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
===================================================================

class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for(int i:nums){
            al.add(i);
        }
        permuteUnique(al,0);
        return list;
    }
    public List<List<Integer>> permuteUnique(List<Integer> al , int element){
        for(int i= element ;i<al.size();i++){
            Collections.swap(al,i,element);
            permuteUnique(al,element+1);
            Collections.swap(al,element,i);
        }
        if(element == al.size()-1){
            ArrayList<Integer> a = new ArrayList<>();
            for(int i:al){
                a.add(i);
            }
            if(!list.contains(a)){
                list.add(a);
            }
        }
        return list;
    }
}
