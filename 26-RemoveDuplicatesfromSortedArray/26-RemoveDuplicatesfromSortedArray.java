// Last updated: 22/10/2026, 15:47:33
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        int slow = 0;
5
6        for (int fast = 1; fast < nums.length; fast++) {
7
8            if (nums[slow] != nums[fast]) {
9
10                slow++;
11
12                nums[slow] = nums[fast];
13
14            }
15
16        }
17
18        return slow + 1;
19
20    }
21}