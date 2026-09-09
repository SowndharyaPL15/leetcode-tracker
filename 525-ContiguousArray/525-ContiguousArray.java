// Last updated: 9/9/2026, 2:10:06 PM
class Solution {
    public int findMaxLength(int[] nums) {
        // int maxlen=0;
        // for(int i=0;i<nums.length;i++){
        //     int zero=0;
        //     int one=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0){
        //             zero++;
        //         }
        //         else{
        //             one++;
        //         }
        //         if(zero==one){
        //             maxlen=Math.max(maxlen,j-i+1);
        //         }
        //     }
        // }
        // return maxlen;
         Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int sum = 0, maxlen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : 1);
            if (map.containsKey(sum)) {
                maxlen = Math.max(maxlen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxlen;
    }
}