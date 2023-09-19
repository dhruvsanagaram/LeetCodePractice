//8/7/23 - Best Time to Buy and Sell Stock - Two Pointer - Easy
class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxDiff = 0;
        while(right != prices.length){
            if(prices[right] < prices[left]){
                left = right;
            }
            else{
                maxDiff = Math.max(maxDiff, prices[right] - prices[left]);
            }

            right++;
        }
        return maxDiff;
    }
}

