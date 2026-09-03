// Last updated: 9/3/2026, 12:25:11 PM
1class Solution {
2    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
3        int n = req_skills.length;
4        int m = people.size();
5        HashMap<String, Integer> skillIndex = new HashMap<>();
6        for (int i = 0; i < n; i++) {
7            skillIndex.put(req_skills[i], i);
8        }
9        List<Integer>[] dp = new List[1 << n];
10        dp[0] = new ArrayList<>();
11        for (int i = 0; i < m; i++) {
12            int currentSkill = 0;
13            for (String skill : people.get(i)) {
14                currentSkill |= 1 << skillIndex.get(skill);
15            }
16            List<Integer>[] old = dp.clone();
17            for (int prev = 0; prev < (1 << n); prev++) {
18                if (old[prev] == null) {
19                    continue;
20                }
21                int combined = prev | currentSkill;
22                if (dp[combined] == null ||
23                    old[prev].size() + 1 < dp[combined].size()) {
24                    dp[combined] = new ArrayList<>(old[prev]);
25                    dp[combined].add(i);
26                }
27            }
28        }
29        return dp[(1 << n) - 1]
30                .stream()
31                .mapToInt(Integer::intValue)
32                .toArray();
33    }
34}