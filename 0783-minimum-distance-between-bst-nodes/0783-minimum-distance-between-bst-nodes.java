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
    private int min = 100000;

    public void insertOrder(TreeNode root) {
        if(root != null){
            insertOrder(root.left);
            if(this.val != -1 && root.val - this.val < this.min){
                this.min = root.val - this.val;
            }
            this.val = root.val;
            insertOrder(root.right);
        }
    }
    public int minDiffInBST(TreeNode root) {
        insertOrder(root);
        return this.min;
    }
}