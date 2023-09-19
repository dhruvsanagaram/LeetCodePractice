//3/7/23 - Maximum Depth of a Binary Tree - Trees - DFS - Easy
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left == null && root.right != null){
            return 1 + maxDepth(root.right);
        }
        if(root.left != null && root.right == null){
            return 1 + maxDepth(root.left);
        }
        
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}

