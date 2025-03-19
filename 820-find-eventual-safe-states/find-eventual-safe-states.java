class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj=new ArrayList<>();
        int V= graph.length;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
     int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int it:graph[i]){
                adj.get(it).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                qu.offer(i);
            }
        }

        List<Integer> ans=new ArrayList<>();
        while(!qu.isEmpty()){
            int node=qu.poll();
            ans.add(node);
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                {
                    qu.offer(it);
                }
            }
        }
         Collections.sort(ans);
         return ans;
       
        
    }
}