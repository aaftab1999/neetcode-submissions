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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return subRoot == null;
        if (subRoot == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val == subRoot.val) {
                if (isSubTreeIterative(node, subRoot)) {
                    return true;
                }
            }
            if (node.right != null)
                queue.offer(node.right);
            if (node.left != null)
                queue.offer(node.left);
        }
        return false;
    }

    public boolean isSubTreeIterative(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.offer(new TreeNode[] {root, subRoot});
        while (!queue.isEmpty()) {
            TreeNode[] pair = queue.poll();
            TreeNode p = pair[0];
            TreeNode q = pair[1];
            if (p == null && q == null)
                continue;
            if (p == null || q == null || p.val != q.val)
                return false;

            queue.offer(new TreeNode[] {p.left, q.left});
            queue.offer(new TreeNode[] {p.right, q.right});
        }
        return true;
    }
}
