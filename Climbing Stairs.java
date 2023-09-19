//3/4/23 - Climbing Stairs - Hash Map - Dynamic Programming - Easy
class Solution {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        else{
            map.put(n, climbStairs(n-1) + climbStairs(n-2));
            return map.get(n);
        }
    }
}

