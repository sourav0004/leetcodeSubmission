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
        Queue<TreeNode> qs=new LinkedList<>();
        if(root==null)
         return 0;
        int c=0;
        qs.add(root);
        while(!qs.isEmpty()){
            int s=qs.size();
            for(int i=0;i<s;i++){
            TreeNode node=qs.poll();
            if(node.left!=null)
            qs.add(node.left);
            if(node.right!=null)
            qs.add(node.right);
            }
            c++;
        }
        return c;
    }
}