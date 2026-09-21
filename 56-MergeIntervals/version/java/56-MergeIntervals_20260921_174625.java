// Last updated: 9/21/2026, 5:46:25 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4        int index = 0;
5        for (int i = 1; i < intervals.length; i++) {
6            if (intervals[index][1] >= intervals[i][0]) {
7                intervals[index][1] =
8                    Math.max(intervals[index][1], intervals[i][1]);
9            }
10            else {
11                index++;
12                intervals[index] = intervals[i];
13            }
14        }
15        return Arrays.copyOf(intervals, index + 1);
16    }
17}