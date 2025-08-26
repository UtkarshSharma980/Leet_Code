class Solution {
    public int reverseDegree(String s) {
        int ans = 0,i=0;
        for(char c:s.toCharArray()){
            i++;
            ans += (26 - (c - 'a'))*i;
        } 
        return ans;
    }
}