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
    public int kthSmallest(TreeNode root, int k) {
        int []d=new int[2];
        d[0]=k;
        dfs(root,d);
        return d[1];
    }
    public void dfs(TreeNode root,int[] d){
        if(root==null)
        return;
        dfs(root.left,d);
        d[0]-=1;
        if(d[0]==0){
            d[1]=root.val;
            return;
        }
        dfs(root.right,d);
    }
}