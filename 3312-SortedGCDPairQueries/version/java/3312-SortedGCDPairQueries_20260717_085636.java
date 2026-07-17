// Last updated: 7/17/2026, 8:56:36 AM
1class Solution {
2    public int[] gcdValues(int[] nums, long[] queries) {
3        int n = nums.length;
4        int maxValue = Arrays.stream(nums).max().orElse(0);
5        int[] divisorCount = new int[maxValue + 1];
6        for (int number : nums) {
7            for (int i = 1; i * i <= number; i++) {
8                if (number % i == 0) {
9                    divisorCount[i]++;
10                    if (i != number / i) {
11                        divisorCount[number / i]++;
12                    }
13                }
14            }
15        }
16        long[] gcdPairCount = new long[maxValue + 1];
17        for (int gcd = maxValue; gcd >= 1; gcd--) {
18            long count = divisorCount[gcd];
19            gcdPairCount[gcd] = count * (count - 1) / 2;
20            for (int multiple = 2 * gcd; multiple <= maxValue; multiple += gcd) {
21                gcdPairCount[gcd] -= gcdPairCount[multiple];
22            }
23        }
24        long[] prefixSum = new long[maxValue + 1];
25        for (int gcd = 1; gcd <= maxValue; gcd++) {
26            prefixSum[gcd] = prefixSum[gcd - 1] + gcdPairCount[gcd];
27        }
28        int[] result = new int[queries.length];
29        for (int i = 0; i < queries.length; i++) {
30            long query = queries[i];
31            long left = 1, right = maxValue, answer = -1;
32            while (left <= right) {
33                long mid = (left + right) / 2;
34                if (prefixSum[(int) mid] > query) {
35                    answer = mid;
36                    right = mid - 1;
37                } else {
38                    left = mid + 1;
39                }
40            }
41            result[i] = (int) answer;
42        }
43        return result;
44    }
45}