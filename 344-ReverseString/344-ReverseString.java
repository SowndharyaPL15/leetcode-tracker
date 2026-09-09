// Last updated: 9/9/2026, 2:11:49 PM
class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char t=s[left];
            s[left]=s[right];
            s[right]=t;
            left++;
            right--;
        }
        System.out.print(s);  
    }
}