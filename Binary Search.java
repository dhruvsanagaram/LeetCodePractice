//8/7/23 - Binary Search - Two Pointer - Easy

class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }
            return -1;
        }

        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int m = (start + end)/2;
            if(nums[m] == target){
                return m;
            }
            else if(target < nums[m]){
                end = m-1;
            }
            else if(target > nums[m]){
                start = m+1;
            }
        }
        return -1;
    }
}

