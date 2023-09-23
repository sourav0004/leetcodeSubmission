class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.merge(s.charAt(i),1,(a,b)->a+b);
        }

        for(int i=0;i<t.length();i++){
            map.merge(t.charAt(i),1,(a,b)->a-b);
        }

        for(Character k:map.keySet()){
            if(map.get(k)==0)
             continue;
             else
             return false;
        }

        return true;
        
    }
}