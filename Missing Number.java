//2/22/23 - Missing Number - Hash Map - Easy
class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i : nums){
            if(map.containsKey(i) == false){
                map.put(i, true);
            }
        }
        int num = Integer.MAX_VALUE;
        if(map.get(nums.length) == null){
            return nums.length;
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(i) == null){
                num = i;
            }
        }
        return num;
    }
}

