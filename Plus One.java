class Solution {
    public int[] plusOne(int[] digits) {
        //get the integer from the digits
        //increment the integer by 1
        //convert back to digits using reverse method from 1

        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNum = new int[digits.length+1];
        newNum[0] = 1;
        return newNum;
    }
}
