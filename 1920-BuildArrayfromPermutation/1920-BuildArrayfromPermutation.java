// Last updated: 24/09/2026, 19:22:54
1class Solution {
2    public int[] buildArray(int[] nums) {
3        int[] new_arr = new int[nums.length];
4
5        for (int i = 0; i < nums.length; i++) {
6            int a = nums[i];
7            new_arr[i] = nums[a];
8        }
9
10        return new_arr;
11    }
12}