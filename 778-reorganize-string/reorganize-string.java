class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            map.merge(s.charAt(i),1,(a,b)->a+b);
        }

        pq.addAll(map.entrySet());

        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> ele=pq.poll();
            int f=ele.getValue();
            char c=ele.getKey();
            if(f-1>s.length()-f)
            return "";
            if(ans.length()==0 || ans.charAt(ans.length()-1)!=c){
                ans.append(c);
                ele.setValue(--f);
                if(f!=0)
                 pq.offer(ele);
            }
            else{
                 Map.Entry<Character,Integer> ele1=pq.poll();
                 int f1=ele1.getValue();
                 char c1=(char)ele1.getKey();

                 ans.append(c1);
                 ele1.setValue(--f1);
                 if(f1!=0){
                     pq.offer(ele1);
                 }

                 pq.offer(ele);

            }
        }

        return new String(ans);

    }
}