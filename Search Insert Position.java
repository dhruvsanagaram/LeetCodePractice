//1/8/23 - Search Insert Position - Arrays - Easy
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] >= target){
            return 0;
        }
        for(int i = 1; i <= nums.length-1; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i-1] < target && target < nums[i]){
                return i;
            }
            if(i+1 != nums.length && nums[i-1] < target && target < nums[i+1]){
                return i+1;
            }
        }
        return nums.length;
    }
}

