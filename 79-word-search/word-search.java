class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int index=0;
        boolean istrue=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                   istrue=search(0,i,j,n,m,board,word);
                   if(istrue)
                   return true;

                }
            }

        }

        return false;
    }

    private boolean search(int index,int r,int c,int n,int m,char[][] board,String word){
        if(index==word.length())
         return true;

         if(r<0|| c<0 || r==n|| c==m|| board[r][c]!=word.charAt(index) || board[r][c]=='!')
         return false;

         char ch=word.charAt(index);
         board[r][c]='!';
         boolean left=search(index+1,r,c-1,n,m,board,word);
         boolean right=search(index+1,r,c+1,n,m,board,word);
         boolean top=search(index+1,r-1,c,n,m,board,word);
         boolean buttom=search(index+1,r+1,c,n,m,board,word);
         board[r][c]=ch;

         return left||right||top||buttom;
    }
}