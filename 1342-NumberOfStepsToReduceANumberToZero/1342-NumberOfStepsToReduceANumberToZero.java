// Last updated: 9/9/2026, 2:05:30 PM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num>0){
            if(num%2==0){
                num/=2;
            }
            else{
                num-=1;
            }
            c++;
        }
        return c;
    }
}