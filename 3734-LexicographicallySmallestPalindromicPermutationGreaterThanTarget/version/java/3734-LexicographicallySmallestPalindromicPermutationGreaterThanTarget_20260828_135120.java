// Last updated: 8/28/2026, 1:51:20 PM
1class Solution {
2
3    private String buildPalindrome(String half, char middle) {
4        StringBuilder result = new StringBuilder(half);
5
6        if (middle != 0) {
7            result.append(middle);
8        }
9
10        for (int i = half.length() - 1; i >= 0; --i) {
11            result.append(half.charAt(i));
12        }
13
14        return result.toString();
15    }
16
17    private String smallestGreaterOrEqual(int[] originalCount, String targetHalf) {
18        int[] count = originalCount.clone();
19        int k = targetHalf.length();
20        int matched = 0;
21
22        while (matched < k && count[targetHalf.charAt(matched) - 'a'] > 0) {
23            count[targetHalf.charAt(matched) - 'a']--;
24            matched++;
25        }
26
27        if (matched == k) {
28            return targetHalf;
29        }
30
31        for (int pos = matched; pos >= 0; --pos) {
32            if (pos < matched) {
33                count[targetHalf.charAt(pos) - 'a']++;
34            }
35
36            for (int c = targetHalf.charAt(pos) - 'a' + 1; c < 26; ++c) {
37                if (count[c] == 0) continue;
38
39                StringBuilder result = new StringBuilder(targetHalf.substring(0, pos));
40                result.append((char) ('a' + c));
41                count[c]--;
42
43                for (int ch = 0; ch < 26; ++ch) {
44                    while (count[ch]-- > 0) {
45                        result.append((char) ('a' + ch));
46                    }
47                    count[ch] = Math.max(count[ch], 0);
48                }
49
50                return result.toString();
51            }
52        }
53
54        return "";
55    }
56
57    private boolean nextPermutation(char[] half) {
58        int pivot = half.length - 2;
59
60        while (pivot >= 0 && half[pivot] >= half[pivot + 1]) {
61            pivot--;
62        }
63
64        if (pivot < 0) {
65            return false;
66        }
67
68        int swapPos = half.length - 1;
69
70        while (half[swapPos] <= half[pivot]) {
71            swapPos--;
72        }
73
74        char temp = half[pivot];
75        half[pivot] = half[swapPos];
76        half[swapPos] = temp;
77
78        int left = pivot + 1;
79        int right = half.length - 1;
80
81        while (left < right) {
82            temp = half[left];
83            half[left] = half[right];
84            half[right] = temp;
85            left++;
86            right--;
87        }
88
89        return true;
90    }
91
92    public String lexPalindromicPermutation(String s, String target) {
93        int[] frequency = new int[26];
94
95        for (char ch : s.toCharArray()) {
96            frequency[ch - 'a']++;
97        }
98
99        char middle = 0;
100        int oddCount = 0;
101
102        for (int c = 0; c < 26; ++c) {
103            if ((frequency[c] & 1) == 1) {
104                oddCount++;
105                middle = (char) ('a' + c);
106            }
107        }
108
109        if (oddCount > 1) {
110            return "";
111        }
112
113        int[] halfCount = new int[26];
114
115        for (int c = 0; c < 26; ++c) {
116            halfCount[c] = frequency[c] / 2;
117        }
118
119        int k = s.length() / 2;
120        String targetHalf = target.substring(0, k);
121
122        String halfString = smallestGreaterOrEqual(halfCount, targetHalf);
123
124        if (halfString.isEmpty() && k > 0) {
125            return "";
126        }
127
128        String candidate = buildPalindrome(halfString, middle);
129
130        if (candidate.compareTo(target) > 0) {
131            return candidate;
132        }
133
134        char[] half = halfString.toCharArray();
135
136        if (!nextPermutation(half)) {
137            return "";
138        }
139
140        return buildPalindrome(new String(half), middle);
141    }
142}