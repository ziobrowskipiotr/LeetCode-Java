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
        Deque<TreeNode> kolejka = new ArrayDeque<>();
        kolejka.add(root);
        int siz;
        while(!kolejka.isEmpty()){
            lista.add(kolejka.getFirst().val);
            siz = kolejka.size();
            while(siz>0){
                if(kolejka.getFirst().right != null){
                    kolejka.add(kolejka.getFirst().right);
                }
                if(kolejka.getFirst().left != null){
                    kolejka.add(kolejka.getFirst().left);
                }
                kolejka.poll();
                siz--;
            }
        }
        return lista;
    }
}