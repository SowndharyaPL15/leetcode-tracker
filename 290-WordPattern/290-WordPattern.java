// Last updated: 9/9/2026, 2:12:24 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
       String s1[]=s.split(" ");
       if(s1.length!=pattern.length()){
        return false;
       } 
       HashMap<Character,String>map=new HashMap<>();
       HashSet<String> set=new HashSet<>();
       for(int i=0;i<pattern.length();i++){
        char c=pattern.charAt(i);
        String w=s1[i];
        if(map.containsKey(c)){
            if(!map.get(c).equals(w)){
                return false;
            }
        }
        else{
            if(set.contains(w)){
                return false;
            }
            map.put(c,w);
            set.add(w);
        }
      }
       return true;
    }
}