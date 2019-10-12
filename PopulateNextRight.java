//Time Complexity: O(n)
//Space complexity: O(n)
//Accepted on leetcode
class Solution {
    public Node connect(Node root) 
    {
        //Check if the tree is empty thn return
        if(root == null) return root;
        //call the link function pass the left an the right node as arguments
        link(root.left, root.right);
        return root;
    }
    //Link function to find the next right pointer for the node
    public void link(Node left, Node right)
    {
        //If the left and the right node both are null then return
        if(left==null && right==null) return ;
        //current nodes left nodes next element is the same as the current elements right .
        left.next = right;
        //call the link function recursively and pass the left and right nodes of the left node element of current node
        link(left.left,left.right);
        //call the link function recursively and pass the left node of the right node of current node and the right node of the left node of the current node as arguments to link
        link(left.right,right.left);
        //then same function for the left node of the right node of current node and the right node of the right node of current node.
        link(right.left,right.right);
    }
}