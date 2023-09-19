//1/11/23 - Add Binary - Strings - Easy
import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger a_new = new BigInteger(a, 2);
        return a_new.add(new BigInteger(b, 2)).toString(2);
        /*
        String sum = "";
        int carry = 0;
        int numA = 0;
        int numB = 0;

        for(int i = a.length()-1; i>=0; i--){
            try{
                numA = Integer.parseInt(a.charAt(i) + "");
            }
            catch(IndexOutOfBoundsException e){
                numA = 0;
            }

            System.out.print(numA + " ");

            try{
                numB = Integer.parseInt(b.charAt(i) + "");
            }
            catch(IndexOutOfBoundsException e){
                numB = 0;
            }

            System.out.println(numB + " ");

            if(carry == 0){
                if(numA == 1 && numB == 1){
                    carry = 1;
                    sum += '0';
                }
                if(numA == 0 && numB == 0){
                    carry = 0;
                    sum += '0';
                }
                if((numA == 0 && numB == 1) 
                    || (numA == 1 && numB == 0))
                {
                    carry = 0;
                    sum += '1';
                }
            }

            if(carry == 1){
                if(numA == 1 && numB == 1){
                    carry = 1;
                    sum += '1';
                }
                if(numA == 0 && numB == 0){
                    carry = 0;
                    sum += '1';
                }
                if((numA == 0 && numB == 1) 
                    || (numA == 1 && numB == 0))
                {
                    carry = 1;
                    sum += '0';
                }
            }
            System.out.println(sum);
        }
        return null;
        */
    }
}

