//3/5/23 - Minimum Depth of a Binary Tree - Trees - DFS - Easy
class Solution {
    ArrayList
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left != null && root.right == null){
            return 1 + minDepth(root.left);
        }
        if(root.left == null && root.right != null){
            return 1 + minDepth(root.right);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

