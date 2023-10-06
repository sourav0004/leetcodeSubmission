class Solution {
    public int largestRectangleArea(int[] heights) {
        int l=heights.length;
        int[] nextSmallerElementLeft=new int[l];
        int[] nextSmallerElementRight=new int[l];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<l;i++){

            while(!st.empty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.empty()){
                nextSmallerElementLeft[i]=0;
               
            }
            else{
                nextSmallerElementLeft[i]=st.peek()+1;
            }

             st.push(i);

            

        }

        while(!st.empty())
        st.pop();

         for(int i=l-1;i>=0;i--){

            while(!st.empty() && heights[st.peek()]>heights[i]){
                st.pop();
            }

            if(st.empty()){
                nextSmallerElementRight[i]=l-1;
                
            }
            else{
                nextSmallerElementRight[i]=st.peek()-1;
            }

            st.push(i);

        }

        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            int area=((nextSmallerElementRight[i]-nextSmallerElementLeft[i])+1)*heights[i];
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;
        
    }
}