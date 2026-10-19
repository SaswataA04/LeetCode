// Last updated: 19/10/2026, 22:38:00
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        List<Integer> result = new ArrayList<>();
4
5        Arrays.sort(nums);
6
7
8        for (int i = 0; i < nums.length; i++) {
9            if (nums[i] == target) {
10            result.add(i);
11    }
12}
13     return result;   
14    }
15}