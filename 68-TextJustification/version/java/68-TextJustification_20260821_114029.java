// Last updated: 8/21/2026, 11:40:29 AM
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> result = new ArrayList<>();
4        int i = 0;
5        while (i < words.length) {
6            int j = i, len = 0;
7            while (j < words.length && len + words[j].length() + (j - i) <= maxWidth) {
8                len += words[j].length();
9                j++;
10            }
11            int gaps = j -i- 1;
12            int spaces = maxWidth - len;
13            StringBuilder line = new StringBuilder();
14
15            if (j == words.length || gaps == 0) {
16                for (int k = i; k < j; k++) {
17                    line.append(words[k]);
18                    if (k != j - 1) line.append(" ");
19                }
20                while (line.length() < maxWidth) line.append(" ");
21            } else {
22                int spaceEach = spaces / gaps, extra = spaces % gaps;
23                for (int k = i; k < j; k++) {
24                    line.append(words[k]);
25                    if (k != j - 1) {
26                        int toAdd = spaceEach + (extra-- > 0 ? 1 : 0);
27                        line.append(" ".repeat(toAdd));
28                    }
29                }
30            }
31            result.add(line.toString());
32            i = j;
33        }
34        return result;
35    }
36}