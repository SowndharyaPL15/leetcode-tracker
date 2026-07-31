// Last updated: 7/31/2026, 12:29:40 PM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> res = new ArrayList<>();
4        for (int[] current : intervals) {
5            if (current[1] < newInterval[0]) {
6                res.add(current);
7            }
8            else if (current[0] > newInterval[1]) {
9                res.add(newInterval);
10                newInterval = current;
11            }
12            else {
13                newInterval[0] = Math.min(newInterval[0], current[0]);
14                newInterval[1] = Math.max(newInterval[1], current[1]);
15            }
16        }
17        res.add(newInterval);
18        return res.toArray(new int[res.size()][]);
19    }
20}