// Last updated: 19/10/2026, 22:33:01
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        List<Integer> result = new ArrayList<>();
4
5        Arrays.sort(nums);
6
7        //int ptr =0 ;
8
9        for (int i = 0; i < nums.length; i++) {
10            if (nums[i] == target) {
11            result.add(i);
12    }
13}
14     return result;   
15    }
16}