class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(var s : strs){
            int[] freq=new int[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            String key= Arrays.toString(freq);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }

        for(var s:map.values()){
            ans.add(s);
        }
        return ans;
    }
}