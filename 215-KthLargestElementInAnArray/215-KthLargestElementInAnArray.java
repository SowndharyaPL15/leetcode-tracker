// Last updated: 9/9/2026, 2:13:07 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // for(int j=1;j<k;j++){
        //     int max=nums[0],idx=0;
        //     for(int i=1;i<nums.length;i++){
        //         if(nums[i]>max){
        //             max=nums[i];
        //             idx=i;
        //         }
        //     }
        //     nums[idx]=Integer.MIN_VALUE;
        // }
        // int max=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]>max){
        //         max=nums[i];
        //     }
        // }
        // return max;
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll(); 
            }
        }
        return pq.peek();
    }
}