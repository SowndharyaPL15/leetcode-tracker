// Last updated: 9/9/2026, 2:18:38 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if( strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length ;i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        String common = x.nextLine();
    }
}    