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
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    int sum(TreeNode root, int c){
        if(root==null) return 0;
        c=c*10+root.val;
        if(root.left==null&&root.right==null){
            return c;
        }
        return sum(root.left,c)+sum(root.right,c);
    }
}