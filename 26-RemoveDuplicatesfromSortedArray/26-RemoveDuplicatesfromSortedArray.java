// Last updated: 09/10/2026, 20:37:09
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        int slow =0;
5        for (int fast=1 ; fast<nums.length ; fast++){
6
7            if (nums[slow] != nums[fast]){
8                slow++;
9
10                nums[slow] = nums[fast];
11            }
12            
13            
14        }
15        return slow + 1;
16    }
17}