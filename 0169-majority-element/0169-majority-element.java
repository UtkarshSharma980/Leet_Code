class Solution {
    public int majorityElement(int[] nums) {
        int votes = 0,curr = nums[0];
        for(int n:nums){
            if(curr == n){
                votes++;
            } else {
                votes--;
                if(votes == 0){
                    curr = n;
                    votes++;
                }
            }
        }
        return curr;
    }
}