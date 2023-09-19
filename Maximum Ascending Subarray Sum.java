//7/30/23 - Maximum Ascending Subarray Sum - Arrays - Easy
class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 0)
          return 0;
        int tempMax = nums[0];
        int maxSum = tempMax;
        int start = 0;
        int end = 1;
        while(start != nums.length && end < nums.length){
            if(nums[end] <= nums[end - 1]){
                start = end;
                end = start+1;
                tempMax = nums[start];
            }
            else{
                tempMax += nums[end];
                end++;
            }
            maxSum = Math.max(tempMax, maxSum);
        }
        return maxSum;
    }
}

