// Last updated: 9/1/2026, 11:45:45 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        
        int c_5 =0 , c_10 =0, c_20 =0;
        for(int i=0;i< n;i++){
            if(bills[i] == 5 ){
                c_5++;
            }
            else if(bills[i] == 10){
                if(c_5>=1){
                    c_5--;
                    c_10++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(c_5>=1 && c_10>=1){
                    c_5--;
                    c_10--;
                    c_20++;
                }
                else if(c_5>=3){
                    c_5-=3;
                    c_20++;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;  
    } 
}