class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap <>();
        for(int i= 0 ; i <= nums.length-1 ; i++)
        {
            int key = nums[i];
            if (map.containsKey(key))
            {
                return true;
            }
            else map.put(key, 1);
        }
        return false;
 
    }
}
