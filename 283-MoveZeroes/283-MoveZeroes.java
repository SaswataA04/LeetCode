// Last updated: 26/09/2026, 00:12:40
1class Solution {
2    public void moveZeroes(int[] nums) {
3
4        int j = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7
8            if (nums[i] != 0) {
9
10                int temp = nums[i];
11                nums[i] = nums[j];
12                nums[j] = temp;
13
14                j++;
15            }
16        }
17    }
18}