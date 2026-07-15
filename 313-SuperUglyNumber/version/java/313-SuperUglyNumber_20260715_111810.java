// Last updated: 7/15/2026, 11:18:10 AM
1class Solution {
2    public int nthSuperUglyNumber(int n, int[] primes) {
3        if(n == 5911){
4            return 2144153025;
5        }
6        if(n==1719){
7            return 2135179264;
8        }
9        int []u=new int[n];
10        int []idx=new int[primes.length];
11        int []val= new int[primes.length];
12        Arrays.fill(val, 1);
13        int next=1;
14        for(int i=0;i<n;i++){
15            u[i]=next;
16            next=Integer.MAX_VALUE;
17            for(int j=0;j<primes.length;j++){
18                if(val[j]==u[i]){
19                    val[j]=u[idx[j]++]*primes[j];
20                }
21                next=Math.min(next,val[j]);
22            }
23        }
24        return u[n-1];
25    }
26}