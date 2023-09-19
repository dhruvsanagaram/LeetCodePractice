//8/29/23 - Diameter of Binary Tree - Trees - Easy
class Solution {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return ans;
    }

    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSubTreeHeight = helper(root.left);
        int rightSubTreeHeight = helper(root.right);
        ans = Math.max(leftSubTreeHeight + rightSubTreeHeight, ans);
        return 1 + Math.max(leftSubTreeHeight, rightSubTreeHeight);
    }
}

