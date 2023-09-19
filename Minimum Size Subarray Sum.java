//2/19/23 - Minimum Size Subarray Sum - Array - Sliding Window - Medium
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left=0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(left <= i && sum >= target){
                result = Math.min(result, i - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        
        if(result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
}

