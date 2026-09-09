// Last updated: 9/9/2026, 2:11:45 PM
class Solution {
    public String reverseVowels(String s) {
      String vowels="aeiouAEIOU";
      char[] ch=s.toCharArray();
      ArrayList<Character>list=new ArrayList<>();  
      for(char c:ch){
        if(vowels.indexOf(c)!=-1){
            list.add(c);
        }
      }
        int index=list.size()-1;
        for(int i=0;i<ch.length;i++){
            if(vowels.indexOf(ch[i])!=-1){
                ch[i]=list.get(index);
                index--;
            }
        }
        return(new String(ch));
    }
}