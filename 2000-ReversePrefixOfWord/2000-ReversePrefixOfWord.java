// Last updated: 9/9/2026, 12:36:59 PM
public class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        String prefix = word.substring(0, index + 1);
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();
       
        return reversedPrefix + word.substring(index + 1);
    }
}
