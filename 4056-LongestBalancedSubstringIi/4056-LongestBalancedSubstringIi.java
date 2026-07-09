// Last updated: 7/9/2026, 9:48:28 AM
import java.util.*;
class Solution {
    public int longestBalanced(String s) {
        int length=s.length();
        if(length==0) return 0;
        char[]chars=s.toCharArray();
        int max=0;
        max=Math.max(max,longestSingleChar(chars));
        max=Math.max(max,longestTwoChar('a','b',chars));
        max=Math.max(max,longestTwoChar('b','c',chars));
        max=Math.max(max,longestTwoChar('c','a',chars));
        max=Math.max(max,longestThreeChar(chars));
        return max;
    }
    private int longestSingleChar(char[] chars) {
        int maxLen=0;
        char currentChar=chars[0];
        int count=0;
        for (char ch : chars) {
            if (ch==currentChar) count++;
            else { currentChar=ch; count=1; }
            maxLen = Math.max(maxLen,count);
        }
        return maxLen;
    }

    private int longestTwoChar(char first, char second, char[] chars) {
        Map<Integer,Integer>Map=new HashMap<>();
        Map.put(0,-1);
        int balance=0,maxLen=0;
        for(int i=0;i<chars.length;i++) {
            if(chars[i]==first) balance++;
            else if(chars[i]==second) balance--;
            else { 
                Map=new HashMap<>(); 
                balance=0; 
                Map.put(0, i); 
                continue; }
            if (Map.containsKey(balance)){
                maxLen=Math.max(maxLen,i-Map.get(balance));
            }
            else Map.put(balance,i);
        }
        return maxLen;
    }

    private int longestThreeChar(char[] chars) {
        Map<String, Integer> diffMap=new HashMap<>();
        diffMap.put("0#0",-1);
        int countA=0,countB=0,countC=0,maxLen=0;
        for(int i=0;i<chars.length;i++) {
            if(chars[i]=='a') countA++;
            else if(chars[i]=='b') countB++;
            else countC++;
            String key=(countA-countB)+"#"+(countA-countC);
            if(diffMap.containsKey(key)){
                maxLen=Math.max(maxLen,i-diffMap.get(key));
            }
            else diffMap.put(key,i);
        }
        return maxLen;
    }
}
