class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n: nums) hm.put(n,hm.getOrDefault(n,0)+1);
        int max = -1, ans = 0;
        for(int n: nums){
            int count = hm.get(n);
            if(count > max){
                max = count;
                ans = n;
            }
        }
        return ans;
    }
}