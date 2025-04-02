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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        
        }

        sum += sumOfLeftLeaves(root.left); //will recursively go through the next left treenode
        sum += sumOfLeftLeaves(root.right); //will resursively go through the next right treenode of the root in each case if the next left treenode of said root is null.

        
        return sum;
    }

}