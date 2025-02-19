/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
         String output="";
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty()){
                TreeNode node = qu.poll();
                if(node==null){
                    output+="#"+",";
                }
                else{
                output+=Integer.toString(node.val)+",";
                qu.offer(node.left);
                qu.offer(node.right);

                }

        }
        return output;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty() || data.charAt(0) == '#') {
        return null; // Handle empty tree or null root
    }
        String[] deserialize = data.split(",");
        Queue<TreeNode> qu = new LinkedList<>();
        TreeNode root= new TreeNode(Integer.parseInt(deserialize[0]));
        qu.offer(root);
        int i=1;
        while(!qu.isEmpty() && i<deserialize.length){
            TreeNode node= qu.poll();
            if(i < deserialize.length && !deserialize[i].equals("#")){
                TreeNode left=new TreeNode(Integer.parseInt(deserialize[i]));
                node.left=left;
                qu.offer(left);
            }
            i++;
            if(i < deserialize.length && !deserialize[i].equals("#")){
                 TreeNode right=new TreeNode(Integer.parseInt(deserialize[i]));
                node.right=right;
                qu.offer(right);
            }

            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));