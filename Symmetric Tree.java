//3/3/23 - Symmetric Tree - Trees - DFS - Easy
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return twoNodeTraversal(root.left, root.right);
    }

    public boolean twoNodeTraversal(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null){
            return true;
        }
        if(leftNode == null ^ rightNode == null){
            return false;
        }
        if(leftNode.val != rightNode.val){
            return false;
        }
        return (twoNodeTraversal(leftNode.left, rightNode.right) 
            && twoNodeTraversal(leftNode.right, rightNode.left));
    }
}

