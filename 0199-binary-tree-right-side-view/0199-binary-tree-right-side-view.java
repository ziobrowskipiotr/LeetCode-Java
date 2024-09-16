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
        List<TreeNode> kolejka = new ArrayList<>();
        int first = 0;
        int temp = 1;
        int siz = temp;
        kolejka.add(root);
        while(first<siz){
            lista.add(kolejka.get(first).val);
            while(first<siz){
                if(kolejka.get(first).right != null){
                    kolejka.add(kolejka.get(first).right);
                    temp++;
                }
                if(kolejka.get(first).left != null){
                    kolejka.add(kolejka.get(first).left);
                    temp++;
                }
                first++;
            }
            siz = temp;
        }
        return lista;
    }
}