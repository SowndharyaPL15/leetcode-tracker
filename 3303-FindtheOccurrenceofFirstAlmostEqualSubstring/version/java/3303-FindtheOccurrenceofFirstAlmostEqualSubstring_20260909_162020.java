// Last updated: 9/9/2026, 4:20:20 PM
1class Solution {
2    public int[] zFunction(String input) {
3        int length = input.length();
4        int[] zArray = new int[length];
5        int left = 0, right = 0;
6
7        for (int i = 1; i < length; i++) {
8            if (i < right) {
9                zArray[i] = Math.min(right - i, zArray[i - left]);
10            }
11            while (i + zArray[i] < length && input.charAt(zArray[i]) == input.charAt(i + zArray[i])) {
12                zArray[i]++;
13            }
14            if (i + zArray[i] > right) {
15                left = i;
16                right = i + zArray[i];
17            }
18        }
19        return zArray;
20    }
21
22    public int minStartingIndex(String text, String pattern) {
23        String concatenatedString = pattern + "#" + text;
24        int textLength = text.length();
25        int patternLength = pattern.length();
26        String reversedString = text + "#" + pattern;
27        StringBuilder reversedBuilder = new StringBuilder(reversedString).reverse();
28        
29        int[] zForward = zFunction(concatenatedString);
30        int[] zBackward = zFunction(reversedBuilder.toString());
31    
32        for (int i = patternLength + 1; i < textLength + patternLength + 1; i++) {
33            if (i + patternLength > textLength + patternLength + 1) {
34                break;
35            }
36
37            int currentIndex = i - patternLength - 1;
38            int matchedLength = zForward[i];
39            if (matchedLength >= patternLength - 1) {
40                return currentIndex;
41            }
42            matchedLength++;
43
44            int requiredLength = patternLength - matchedLength;
45            int newId = currentIndex + patternLength - 1;
46            newId = textLength - 1 - newId;
47            newId = patternLength + 1 + newId;
48            if (zBackward[newId] >= requiredLength) {
49                return currentIndex;    
50            }   
51        }
52        return -1;
53    }
54}