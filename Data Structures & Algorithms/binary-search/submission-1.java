class Solution {
    public int search(int[] nums, int target) {
        int mid, first =0, last = nums.length-1;
       while(first <= last)
       {
          mid = (first+ last)/2;
          if(nums[mid] < target)
          {
            first = mid+1;
          }
          else if ( nums[mid] == target)
          {
            return mid;
          }
          else if(nums[mid] > target)
          {
            last = mid-1;
          }
          else return -1;
        }
        return -1;
    }
}
