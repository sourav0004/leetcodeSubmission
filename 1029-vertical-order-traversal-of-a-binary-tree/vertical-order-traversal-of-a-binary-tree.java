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
    public void inOrder(TreeNode root,int row,int col,TreeMap<Integer,TreeMap<Integer,                     PriorityQueue<Integer>>> map){
        if(root==null)
        return;
        inOrder(root.left,row+1,col-1,map);
        map.putIfAbsent(col,new TreeMap<Integer,PriorityQueue<Integer>>());
        map.get(col).putIfAbsent(row,new PriorityQueue<Integer>());
        map.get(col).get(row).offer(root.val);
        inOrder(root.right,row+1,col+1,map);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        inOrder(root,0,0,map);
        for(TreeMap<Integer,PriorityQueue<Integer>> m: map.values()){
            List<Integer> pq=new ArrayList<>();
            for(PriorityQueue<Integer> q: m.values()){
                while(!q.isEmpty()){
                    pq.add(q.poll());
                }
            }
            ans.add(pq);
        }

        return ans;
    }
}