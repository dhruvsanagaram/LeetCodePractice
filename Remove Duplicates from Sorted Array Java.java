class Solution {
    //[0,0,1,1,1,2,2,3,3,4] - Length = 10, i = 1
    //0 1 0 1 1 2 2 3 3 4 - 1 
    //0 1 1 0 1 2 2 3 3 4 - 2
    //0 1 1 1 0 2 2 3 3 4 - 3
    //0 1 1 1 2 0 2 3 3 4 - 4
    //0 1 1 1 2 2 0 3 3 4 - 5
    //0 1 1 1 2 2 3 0 3 4 - 6
    //0 1 1 1 2 2 3 3 0 4 - 7
    //0 1 1 1 2 2 3 3 4 0 - 8
    //0 1 1 1 2 2 3 3 4 0 - 1
    //0 1 1 1 2 2 3 3 4 0 - 2
    //0 1 1 2 1 2 3 3 4 0 - 3
    //0 1 1 2 2 1 3 3 4 0 - 4
    //0 1 1 2 2 3 1 3 4 0 - 5
    //0 1 1 2 2 3 3 1 4 0 - 6
    //0 1 1 2 2 3 3 4 1 0 - 7 
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int unique_index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[unique_index] = nums[i];
                unique_index++;
            }
        }
        return unique_index;
    }
}
