// Last updated: 7/9/2026, 9:51:39 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
     boolean p[]=new boolean [26];
     sentence=sentence.toLowerCase();
     for(char ch:sentence.toCharArray()){
        if(ch>='a'&&ch<='z'){
            p[ch-'a']=true;
        }
     } 
     for(boolean b:p){
     if(!b){
        return false;
     }
    }
     return true;  
    }
}