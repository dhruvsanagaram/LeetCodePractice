//1/9/23 - Preorder Traversal - Trees - Easy
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = traversalHelper(list, root);
        return list;
    }

    public List<Integer> traversalHelper(List<Integer> list, TreeNode root){
        if(root == null){
            return list;
        }
        list.add(root.val);
        traversalHelper(list, root.left);
        traversalHelper(list, root.right);
        return list;
    }
}

