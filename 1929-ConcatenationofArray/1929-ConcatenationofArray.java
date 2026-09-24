// Last updated: 25/09/2026, 01:01:15
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] new_arr = new int[nums.length * 2];
4
5        for (int i=0; i<nums.length; i++){
6
7            new_arr[i]= nums[i];
8            new_arr[i + nums.length] = nums[i];
9
10
11        }
12
13
14return new_arr;
15
16
17
18        
19    }
20}