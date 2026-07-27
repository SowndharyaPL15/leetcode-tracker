// Last updated: 7/27/2026, 2:09:55 PM
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        int length = 0;
4        for(int i=0;i<arr1.length;i++){
5            length = Math.max(length,arr1[i]);
6        }
7        int[] count = new int[length+1];
8        for(int i=0;i<arr1.length;i++){
9            count[arr1[i]]++;
10        }
11        int[] ans = new int[arr1.length];
12        int index=0;
13        for(int i=0;i<arr2.length;i++){
14            while(count[arr2[i]]>0){
15                ans[index] = arr2[i];
16                index++;
17                count[arr2[i]]--;
18            }
19        }
20        for(int i=0;i<count.length;i++){
21            while(count[i]>0){
22                ans[index] = i;
23                index++;
24                count[i]--;
25            }
26        }
27        return ans;
28    }
29}