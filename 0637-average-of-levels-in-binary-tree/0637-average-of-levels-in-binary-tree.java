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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> lista = new ArrayList<>();
        if(root == null){
            return lista;
        }
        Deque<TreeNode> kolejka = new LinkedList<>();
        kolejka.add(root);
        int siz = 0;
        double sum = 0;
        while(!kolejka.isEmpty()){
            siz = kolejka.size();
            sum = 0;
            for(int i=0; i<siz; i++){
                sum+=kolejka.peekFirst().val;
                if(kolejka.peekFirst().left != null){
                    kolejka.add(kolejka.peekFirst().left);
                }
                if(kolejka.peekFirst().right != null){
                    kolejka.add(kolejka.peekFirst().right);
                }
                kolejka.pollFirst();
            }
            lista.add(sum/siz);
        }
        return lista;
    }
}