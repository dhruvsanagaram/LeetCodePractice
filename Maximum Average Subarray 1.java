//7/30/23 - Maximum Average Subarray 1 - Arrays - Easy
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 0){
            return 0;
        }

        int currSum = 0;
        for(int i = 0; i < k;i++){
            currSum += nums[i];
        }

        int start = 0;
        int end = k-1;
        int tempSum = currSum;

        while(end + 1 != nums.length){
            tempSum = tempSum - nums[start] + nums[end+1];
            if(tempSum > currSum){
                currSum = tempSum;
            }
            start += 1;
            end += 1;
        }
        return (double)currSum/k;
    }
}

