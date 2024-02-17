import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int majority_element = nums[0];
        for(int i = 0; i < nums.length; i++){
            System.out.println("NUMS[I]:" + nums[i]);
            System.out.println("KEY FOUND?:" + map.containsKey(nums[i]));
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
                System.out.println("nums[i] freq" + map.get(nums[i]));
                if(map.get(nums[i]) > Math.floor(nums.length/2)){
                    majority_element = nums[i];
                    return majority_element;
                }
            }
            else{
                map.put(nums[i], 1);
            }
        }
        return majority_element;
    }
}