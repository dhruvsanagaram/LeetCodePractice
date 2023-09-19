//8/28/23 - Maximum Depth of Binary Tree - Trees - Easy
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null && root.right == null){
            return 1 + maxDepth(root.left);
        }
        if(root.right != null && root.left == null){
            return 1 + maxDepth(root.right);
        }            
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

