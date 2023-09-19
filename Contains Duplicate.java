//2/22/23 - Contains Duplicate - Hash Map - Easy
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap();
        for(int i = 0; i < nums.length; i++){
            boolean count = numCount.containsKey(nums[i]);
            if(count == false){
                numCount.put(nums[i], 1);   
            }
            else{
                return true;
            }
        }
        return false;
    }
}

