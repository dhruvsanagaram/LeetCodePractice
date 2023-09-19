//3/8/23 - Balanced Binary Tree - Trees - DFS - Easy
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftBalance = height(root.left);
        if(leftBalance == -1){
            return -1;
        }
        int rightBalance = height(root.right);
        if(rightBalance == -1){
            return -1;
        }
        if(Math.abs(leftBalance - rightBalance) > 1){
            return -1;
        }
        return 1 + Math.max(leftBalance, rightBalance);
    }
}

