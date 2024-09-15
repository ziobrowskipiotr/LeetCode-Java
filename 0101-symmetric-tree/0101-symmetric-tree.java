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
    public boolean isSymmetric(TreeNode root) {
        List<TreeNode> lista = new ArrayList<>();
        lista.add(root.left);
        lista.add(root.right); 
        while(!lista.isEmpty()){
            if(lista.get(0) == null || lista.get(1) == null){
                if(lista.get(0) == null && lista.get(1) == null){}
                else{
                    return false;
                }
            }
            else if(lista.get(0).val != lista.get(1).val){
                System.out.println(lista.get(0).val);
                System.out.println( lista.get(1).val);
                return false;
            }
            else{
                lista.add(lista.get(0).left);
                lista.add(lista.get(1).right);
            }
            if(lista.get(1) == null || lista.get(0) == null){
                if(lista.get(1) == null && lista.get(0) == null){}
                else{
                    return false;
                }
            }
            else if(lista.get(1).val != lista.get(0).val){
                return false;
            }
            else{
                lista.add(lista.get(0).right);
                lista.add(lista.get(1).left);
            }
            lista.remove(0);
            lista.remove(0);
        }
        return true;
    }
}