class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.merge(s.charAt(i),1,(a,b)->a+b);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder res=new StringBuilder();
        while(!pq.isEmpty()){

            Map.Entry e=pq.poll();

            for(int i=1;i<=(int)e.getValue();i++){
                res.append(e.getKey());
            }


        }

        return res.toString();
        
    }
}