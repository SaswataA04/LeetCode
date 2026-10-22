// Last updated: 22/10/2026, 21:58:02
1class Solution {
2    public int missingNumber(int[] nums) {
3
4        int sum1 = 0;
5        int sum2 = 0;
6        int diff = 0;
7
8        // TC - O (n)
9
10
11        int a = nums.length;
12        sum1 = (a * (a + 1)) / 2;
13
14        for (int i = 0; i < nums.length; i++) {
15
16            sum2 += nums[i];
17
18        }
19
20        diff =Math.abs( sum2 - sum1);
21
22        return diff;
23
24    }
25
26}
27