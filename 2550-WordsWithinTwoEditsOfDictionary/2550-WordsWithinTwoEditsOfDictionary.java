// Last updated: 7/9/2026, 9:50:47 AM
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (String query : queries) {
            for (String s : dictionary) {
                int dis = 0;
                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) != s.charAt(i)) {
                        dis++;
                    }
                }
                if (dis <= 2) {
                    ans.add(query);
                    break;
                }
            }
        }
        return ans;
    }
}