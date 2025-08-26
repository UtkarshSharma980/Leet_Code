class Solution {
    public boolean isAnagram(String s, String t) {
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();
        Map<Character,Integer> hm = new HashMap<>();
        for(char c:arr1) hm.put(c,hm.getOrDefault(c,0)+1);
        for(char c:arr2) hm.put(c,hm.getOrDefault(c,0)-1);
        for(int n:hm.values()) if(n!=0) return false;
        return true;
    }
}