// Last updated: 9/9/2026, 2:19:06 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]merged=new int[n+m];
      
        for(int i=0;i<n;i++){
            merged[i]=nums1[i];
        }
        for(int j=0;j<m;j++){
            merged[n+j]=nums2[j];
        }
        Arrays.sort(merged);
        int t=n+m;
        if(t%2==1){
            return merged[t/2];
        }
        else{
            return(merged[t/2-1]+merged[t/2])/2.0;
        }
    }
}