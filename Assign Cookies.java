class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //for each child we want to get the minimum total size
        //for cookies because we want to save the remaining 
        //cookies for otherr children. We also want to sort
        //the array of childrens' greeds since we want to
        //satisfy the most amount of children with cookies
        //to get the minimum total size of cookies we can 
        //sort the s array and take the first b elements that
        //satisfy the greed of the first child at the front of 
        //the array. We don't want any wastage however, so if a 
        //child's greed is 1 and the first n cookies give a size of 2
        //and the second child's greed is 2 then we want to satisfy the greed
        //of the 2nd child first

        Arrays.sort(g);
        Arrays.sort(s);
        int maxChildren = 0;
        int i = 0;
        int j = 0;
        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){
                i++;
                maxChildren++;
            }
            j++;
        }
        return maxChildren;
    }
}
