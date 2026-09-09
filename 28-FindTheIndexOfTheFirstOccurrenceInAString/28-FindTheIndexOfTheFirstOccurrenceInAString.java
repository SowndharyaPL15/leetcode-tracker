// Last updated: 9/9/2026, 2:17:58 PM
public class Solution{
    public static int strStr(String haystack,String needle){
        Scanner x=new Scanner(System.in);
        int a=haystack.length();
        int b=needle.length();
        for(int i=0;i<=a-b;i++){
            if(haystack.substring(i,i+b).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}































// public class Solution {
//     public int strStr(String haystack,String needle) {
//         if(needle.isEmpty()) 
//             return 0; 
//         int hLen=haystack.length(),nLen=needle.length();
//         for(int i=0; i<=hLen-nLen;i++) {
//             if(haystack.substring(i,i+nLen).equals(needle)) {
//                 return i;
//             }
//         }
//          return -1;
//     }
//     public static void main(String[] args) {
//         Solution solution=new Solution();
//         System.out.println(solution.strStr("sadbutsad","sad"));  
//         System.out.println(solution.strStr("leetcode","leeto")); 
//     }
// }

