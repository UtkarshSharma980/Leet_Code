class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n: nums) hm.put(n,hm.getOrDefault(n,0)+1);
        int max = -1, ans = 0;
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            // int count = hm.get(n);
            int count = e.getValue();
            if(count > max){
                max = count;
                ans = e.getKey();
            }
        }
        return ans;
    }
}