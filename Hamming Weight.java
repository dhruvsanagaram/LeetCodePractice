public class Hamming Weight {
    public int hammingWeight(int n) {
        //dividing by 2 is a right shift by 1 bit. If the number is odd the least
        //significant bit is going to be 1. So we need to use a for-loop that 
        //iterates until n is 0. If n is odd then we increase the count. 
        //We right shift each iteration
        int hammingWeight = 0;
        while(n != 0){
            System.out.println(Integer.toString(n));
            if((n & 1) == 1){  
                System.out.println("Made it");
                hammingWeight++;

            }
            n >>>= 1;
            System.out.println(n);
            System.out.println(hammingWeight);
            System.out.println();
        }
        return hammingWeight;
    }
}
