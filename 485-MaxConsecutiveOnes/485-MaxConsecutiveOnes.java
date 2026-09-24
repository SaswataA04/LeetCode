// Last updated: 25/09/2026, 01:47:29
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count = 0;
4        int maxCount = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7
8            if (nums[i] == 1) {
9                count++;
10
11                if (count > maxCount) {
12                    maxCount = count;
13                }
14
15            } else {
16                count = 0;
17            }
18        }
19
20        return maxCount;
21    }
22}