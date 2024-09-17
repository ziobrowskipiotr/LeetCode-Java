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
        Deque<TreeNode> kolejka = new LinkedList<>();
        TreeNode cur;
        int siz;
        kolejka.add(root);
        while(!kolejka.isEmpty()){
            lista.add(kolejka.peekFirst().val);
            siz = kolejka.size();
            while(siz>0){
                cur = kolejka.pollFirst();
                if(cur.right != null){
                    kolejka.add(cur.right);
                }
                if(cur.left != null){
                    kolejka.add(cur.left);
                }
                siz--;
            }
        }
        return lista;
    }
}