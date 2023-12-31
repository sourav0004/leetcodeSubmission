class Solution {
    int mod=(int)1e9+7;
    public long power(long x,long y){
        if(y==0)
         return 1;
         long ans=power(x,y/2);
         if(y%2==0)
         return (ans*ans)%mod;
         else
         return (x*ans*ans)%mod;
    }
    public int countGoodNumbers(long n) {
        long first=(n%2==0)?n/2:n/2+1;
        long second=n/2;

        return (int)((power(5,first)*power(4,second))%mod);

    }
}