// Last updated: 9/1/2026, 11:23:44 AM
1class Solution {
2    public int minMoves(String[] classroom, int energy) {
3        int n = classroom.length, m = classroom[0].length();
4        int sr = -1, sc = -1;
5        List<int[]> trash = new ArrayList<>();
6
7        for (int i = 0; i < n; i++)
8            for (int j = 0; j < m; j++) {
9                char ch = classroom[i].charAt(j);
10                if (ch == 'S') { sr = i; sc = j; }
11                else if (ch == 'L') trash.add(new int[]{i, j});
12            }
13
14        int k = trash.size();
15        if (k == 0) return 0;
16
17        int[][] id = new int[n][m];
18        for (int[] row : id) Arrays.fill(row, -1);
19        for (int i = 0; i < k; i++) id[trash.get(i)[0]][trash.get(i)[1]] = i;
20
21        int fullMask = (1 << k) - 1;
22        int[][][][] dist = new int[n][m][energy + 1][1 << k];
23        for (int[][][] a : dist) for (int[][] b : a) for (int[] c : b) Arrays.fill(c, -1);
24
25        Queue<int[]> q = new LinkedList<>();
26        dist[sr][sc][energy][0] = 0;
27        q.add(new int[]{sr, sc, energy, 0});
28
29        int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
30
31        while (!q.isEmpty()) {
32            int[] cur = q.poll();
33            int r = cur[0], c = cur[1], e = cur[2], mask = cur[3];
34            int moves = dist[r][c][e][mask];
35
36            if (mask == fullMask) return moves;
37
38            for (int d = 0; d < 4; d++) {
39                int nr = r + dr[d], nc = c + dc[d];
40                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
41                char ch = classroom[nr].charAt(nc);
42                if (ch == 'X' || e == 0) continue;
43
44                int ne = e - 1, nmask = mask;
45                if (ch == 'L') nmask |= (1 << id[nr][nc]);
46                if (ch == 'R') ne = energy;
47
48                if (dist[nr][nc][ne][nmask] == -1) {
49                    dist[nr][nc][ne][nmask] = moves + 1;
50                    q.add(new int[]{nr, nc, ne, nmask});
51                }
52            }
53        }
54        return -1;
55    }
56}