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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lista = new LinkedList<>();
        if(root == null){
            return lista;
        }
        Queue<TreeNode> kolejka = new LinkedList<>();
        kolejka.add(root);
        while(!kolejka.isEmpty()){
            lista.add(kolejka.element().val);
            int siz = kolejka.size();
            for(int j=0; j<siz; j++){
                if(kolejka.element().right != null){
                    kolejka.add(kolejka.element().right);
                }
                if(kolejka.element().left != null){
                    kolejka.add(kolejka.element().left);
                }
                kolejka.remove();
            }
        }
        return lista;
    }
}