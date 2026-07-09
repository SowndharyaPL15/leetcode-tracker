// Last updated: 7/9/2026, 9:53:21 AM
class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int z=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                z++;
            }
        }
        int i=n-1,j=n+z-1;
        while(i>=0){
            if(j<n){
                arr[j]=arr[i];
            }
            if(arr[i]==0){
                j--;
                if(j<n){
                    arr[j]=0;
                }
            }
            i--;
            j--;
        }
    }
}