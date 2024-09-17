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
    private List<Integer> lista = new ArrayList<>();
    public void insertOrder(TreeNode root) {
        if(root != null){
            insertOrder(root.left);
            this.lista.add(root.val);
            insertOrder(root.right);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        insertOrder(root);
        int siz = lista.size();
        int min = Integer.MAX_VALUE;
        for(int i=siz-1; i>0; i--){
            if(lista.get(i) - lista.get(i-1) < min){
                min = lista.get(i) - lista.get(i-1);
            }
        }
        return min;
    }
}