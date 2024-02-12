//9/19/23 - Path Sum - Trees - Easy
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null 
		&& root.val == targetSum){
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }

    // public boolean hasPathSum(TreeNode root, int targetSum) {
    //     if(root == null){
    //         return false;
    //     }

    //     targetSum -= root.val;
    //     if(root.left == null && root.right == null && targetSum == 0){
    //         return true;
    //     }
    //     boolean left = hasPathSum(root.left, targetSum);
    //     boolean right = hasPathSum(root.right, targetSum);
    //     return left || right;
    // }
}


