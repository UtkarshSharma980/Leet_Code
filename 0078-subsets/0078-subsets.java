class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solver(ans,nums,0,new ArrayList<>());
        return ans;
    }
    void solver(List<List<Integer>> ans,int[] nums,int i,List<Integer> curr){
        ans.add(new ArrayList<>(curr));
        for(int k=i;k<nums.length;k++){
            curr.add(nums[k]);
            solver(ans,nums,k+1,curr);
            curr.remove(curr.size()-1);
        }
    }

}