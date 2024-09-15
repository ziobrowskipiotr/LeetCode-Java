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
    public boolean equal(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        else if(root1 == null || root2 == null) return false;
        else if(root1.val != root2.val) return false;
        else{
            if(equal(root1.left, root2.right)){
                if(equal(root1.right, root2.left))
                    return true;
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }
    public boolean isSymmetric(TreeNode root) {
        return equal(root.left, root.right);
    }
}