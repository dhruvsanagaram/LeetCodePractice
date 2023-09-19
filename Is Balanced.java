//8/29/23 - Is Balanced - Trees - Easy
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;    
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(leftHeight == -1){
            return -1;
        }

        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(rightHeight - leftHeight) > 1){
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}

