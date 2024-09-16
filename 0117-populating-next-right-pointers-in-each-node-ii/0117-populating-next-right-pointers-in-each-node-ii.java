/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    Node temp;
    public void con(Node root){
        if(root.left != null && root.right !=null){
            root.left.next = root.right;
        }
        if(root.next != null){
            this.temp = root.next;
        }
        while(this.temp != null){
            if(root.right != null){
                if(this.temp.left != null){
                    root.right.next = this.temp.left;
                    break;
                }
                else if(this.temp.right != null){
                    root.right.next = this.temp.right;
                    break;
                }
            }
            else if(root.left != null){
                if(this.temp.left != null){
                    root.left.next = this.temp.left;
                    break;
                }
                else if(this.temp.right != null){
                    root.left.next = this.temp.right;
                    break;
                }
            }
            this.temp = temp.next;
        }
        if(root.right != null){
            con(root.right);
        }
        if(root.left != null){
            con(root.left);
        }
    }
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        con(root);
        return root;
    }
}