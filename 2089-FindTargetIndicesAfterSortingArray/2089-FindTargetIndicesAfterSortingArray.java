// Last updated: 19/10/2026, 22:39:54
1
2//POTD 19.10.26
3
4class Solution {
5    public List<Integer> targetIndices(int[] nums, int target) {
6        List<Integer> result = new ArrayList<>();
7
8        Arrays.sort(nums);
9
10
11        for (int i = 0; i < nums.length; i++) {
12            if (nums[i] == target) {
13            result.add(i);
14    }
15}
16     return result;   
17    }
18}
19
20
21//1. sort 
22// 2. if nums[i] = target , add to list 
23//3. retuen list