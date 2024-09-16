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
    public void con(Node root, Node temp){
        if(root.left != null && root.right !=null){
            root.left.next = root.right;
        }
        if(root.next != null){
            temp = root.next;
            while(temp != null){
                if(root.right != null){
                    if(temp.left != null){
                        root.right.next = temp.left;
                        break;
                    }
                    else if(temp.right != null){
                        root.right.next = temp.right;
                        break;
                    }
                }
                else if(root.left != null){
                    if(temp.left != null){
                        root.left.next = temp.left;
                        break;
                    }
                    else if(temp.right != null){
                        root.left.next = temp.right;
                        break;
                    }
                }
                temp = temp.next;
            }
        }
        if(root.right != null){
            con(root.right, temp);
        }
        if(root.left != null){
            con(root.left, temp);
        }
    }
    public Node connect(Node root) {
        System.gc();
        if(root == null){
            return root;
        }
        con(root, root);
        return root;
    }
}