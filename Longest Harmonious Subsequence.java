class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> my_map = new HashMap<>();
        for(int num : nums){
            my_map.put(num, my_map.getOrDefault(num, 0) + 1);
        }

        int lhs_length_max = 0;
        for(int i = 0; i < nums.length; i++){
            if(my_map.containsKey(nums[i] + 1)){
                if(lhs_length_max < my_map.get(nums[i]) + my_map.get(nums[i] + 1)){
                    lhs_length_max = my_map.get(nums[i]) + my_map.get(nums[i] + 1);
                }
            }
        }
        return lhs_length_max;

        //interesting observations:
            //we don't need to include the elements that are omitted to find the LHS
            //in the example that is 5.
            //Also there is nothing saying that the max comes after
            //the minimum, so the order doesn't matter in this algorithm
    }
}
