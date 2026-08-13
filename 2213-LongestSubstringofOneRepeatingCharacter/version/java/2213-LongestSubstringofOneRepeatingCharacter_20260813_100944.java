// Last updated: 8/13/2026, 10:09:44 AM
1class Solution {
2    static class Node {
3        int len, pref, suff, best;
4        char left, right;
5        Node(int len, int pref, int suff, int best, char left, char right) {
6            this.len = len;
7            this.pref = pref;
8            this.suff = suff;
9            this.best = best;
10            this.left = left;
11            this.right = right;
12        }
13    }
14    Node[] tree;
15    char[] s;
16    Node merge(Node a, Node b) {
17        if (a == null) return b;
18        if (b == null) return a;
19        Node res = new Node(
20            a.len + b.len,
21            a.pref,
22            b.suff,
23            Math.max(a.best, b.best),
24            a.left,
25            b.right
26        );
27        if (a.right == b.left) {
28            res.best = Math.max(res.best, a.suff + b.pref);
29            if (a.pref == a.len)
30                res.pref = a.len + b.pref;
31            if (b.suff == b.len)
32                res.suff = b.len + a.suff;
33        }
34        return res;
35    }
36    void build(int u, int l, int r) {
37        if (l == r) {
38            tree[u] = new Node(1, 1, 1, 1, s[l], s[l]);
39            return;
40        }
41        int mid = (l + r) >> 1;
42        build(u << 1, l, mid);
43        build(u << 1 | 1, mid + 1, r);
44        tree[u] = merge(tree[u << 1], tree[u << 1 | 1]);
45    }
46    void update(int u, int l, int r, int pos, char c) {
47        if (l == r) {
48            s[pos] = c;
49            tree[u] = new Node(1, 1, 1, 1, c, c);
50            return;
51        }
52        int mid = (l + r) >> 1;
53        if (pos <= mid)
54            update(u << 1, l, mid, pos, c);
55        else
56            update(u << 1 | 1, mid + 1, r, pos, c);
57        tree[u] = merge(tree[u << 1], tree[u << 1 | 1]);
58    }
59    public int[] longestRepeating(String s, String queryCharacters,int[] queryIndices) {
60        this.s = s.toCharArray();
61        int n = s.length();
62        tree = new Node[4 * n];
63        build(1, 0, n - 1);
64        int[] ans = new int[queryIndices.length];
65        for (int i = 0; i < queryIndices.length; ++i) {
66            update(1, 0, n - 1,
67                   queryIndices[i],
68                   queryCharacters.charAt(i));
69            ans[i] = tree[1].best;
70        }
71        return ans;
72    }
73}