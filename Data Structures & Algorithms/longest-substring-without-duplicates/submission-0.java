class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxi=0;
        Map <Character,Integer> map = new HashMap<>(); 
        if(s.length () ==1) return 1;
        for (int r = 0; r < s.length(); r++) {
            char current = s.charAt(r);
            if (map.containsKey(current) && map.get(current) >= l) {
                l = map.get(current) + 1;
            }
            map.put(current, r);
            maxi = Math.max(maxi, r - l + 1);
        }
        return maxi;
        
    }
}
