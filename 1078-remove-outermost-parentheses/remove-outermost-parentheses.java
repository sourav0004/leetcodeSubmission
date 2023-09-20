class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> st=new Stack<>();
        StringBuilder result=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            if(ch=='('){
                if(st.size()>0){
                    result.append("(");
                }
                st.push('(');
            }
            else{
                st.pop();
                if(st.size()>0)
                    result.append(")");
            }
            
        }
        
        
        return new String(result); 
    }
}