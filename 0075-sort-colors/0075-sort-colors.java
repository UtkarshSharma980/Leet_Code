class Solution {
    public void sortColors(int[] nums) {
        int count [] = new int [3];
        int k=0;
        for(int n:nums) count[n]++;
        for(int i=0;i<3;i++){
            while(count[i]>0){
                nums[k]=i;
                count[i]--;
                k++;
            }
        }
    }
}