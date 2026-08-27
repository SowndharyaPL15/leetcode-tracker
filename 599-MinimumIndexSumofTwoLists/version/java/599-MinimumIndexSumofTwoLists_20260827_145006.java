// Last updated: 8/27/2026, 2:50:06 PM
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3
4        HashMap<String, Integer> mp = new HashMap<>();
5
6        mp.put(list1[0], Integer.MIN_VALUE);
7
8        for (int i = 1; i < list1.length; i++) {
9            mp.put(list1[i], -i);
10        }
11
12        if (!mp.containsKey(list2[0])) {
13            mp.put(list2[0], Integer.MIN_VALUE);
14        } else {
15            if (mp.get(list2[0]) != Integer.MIN_VALUE)
16                mp.put(list2[0], Math.abs(mp.get(list2[0])));
17            else
18                mp.put(list2[0], 0);
19        }
20
21        for (int i = 1; i < list2.length; i++) {
22            if (mp.containsKey(list2[i])) {
23                if (mp.get(list2[i]) != Integer.MIN_VALUE)
24                    mp.put(list2[i], Math.abs(mp.get(list2[i])) + i);
25                else
26                    mp.put(list2[i], i);
27            } else {
28                mp.put(list2[i], -i);
29            }
30        }
31
32        int minVal = Integer.MAX_VALUE;
33
34        for (int val : mp.values()) {
35            if (val >= 0) {
36                minVal = Math.min(minVal, val);
37            }
38        }
39
40        ArrayList<String> ans = new ArrayList<>();
41
42        for (String key : mp.keySet()) {
43            if (mp.get(key) >= 0 && mp.get(key) == minVal) {
44                ans.add(key);
45            }
46        }
47
48        return ans.toArray(new String[0]);
49    }
50}