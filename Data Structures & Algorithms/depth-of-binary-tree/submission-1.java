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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        root.val = 1;
        stack.push(root);
        int depth = 0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            depth = Math.max(node.val, depth);
            if(node!=null){
                if(node.left!=null){
                node.left.val = node.val +1;
                stack.push(node.left);}
                if(node.right!=null){
                node.right.val = node.val +1;
                stack.push(node.right);}

            }
            

        }
         return depth;
    }
}
