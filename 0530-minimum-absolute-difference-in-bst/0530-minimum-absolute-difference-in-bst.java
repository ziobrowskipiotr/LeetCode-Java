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
    private int val = -1;
    private int min = Integer.MAX_VALUE;
    public void insertOrder(TreeNode root) {
        if(root != null){
            insertOrder(root.left);
            if(val != -1 && root.val - val < min){
                min = root.val - val;
            }
            val = root.val;
            insertOrder(root.right);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        insertOrder(root);
        return min;
    }
}