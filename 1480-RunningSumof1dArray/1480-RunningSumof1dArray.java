// Last updated: 24/09/2026, 19:31:17
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int sum = 0;
4        int[] new_arr = new int[nums.length];
5
6        for (int i = 0; i < nums.length; i++) {
7            sum = sum + nums[i]; //calculate the sum
8            new_arr[i] = sum; //start putting the sum in a new array
9        }
10
11        return new_arr;
12    }
13}