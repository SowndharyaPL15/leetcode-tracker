// Last updated: 9/1/2026, 11:45:16 AM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars=s.toCharArray();
        int left=0,right=chars.length-1;
        while(left<right){
            while(left<right && !Character.isLetter(chars[left])){
                left++;
            }
            while(left<right && !Character.isLetter(chars[right])){
                right--;
            }
            if(left<right){
                char temp =chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
        }
        return new String(chars) ;
    }
}

