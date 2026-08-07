// Last updated: 8/7/2026, 2:41:02 PM
1public class Solution {
2    public boolean exist(char[][] board, String word) {
3        int m = board.length;
4        int n = board[0].length;
5
6        boolean[][] visited = new boolean[m][n];
7        boolean result = false;
8        
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                if (board[i][j] == word.charAt(0)) {
12                    result = backtrack(board, word, visited, i, j, 0);
13                    if (result) return true;
14                }
15            }
16        }
17        
18        return false;
19    }
20    
21    private boolean backtrack(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
22        if (index == word.length()) {
23            return true;
24        }
25        
26        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
27            return false;
28        }
29        visited[i][j] = true;
30        if (backtrack(board, word, visited, i + 1, j, index + 1) ||
31            backtrack(board, word, visited, i - 1, j, index + 1) ||
32            backtrack(board, word, visited, i, j + 1, index + 1) ||
33            backtrack(board, word, visited, i, j - 1, index + 1)) {
34            return true;
35        }
36        visited[i][j] = false;
37        return false;
38    }
39}