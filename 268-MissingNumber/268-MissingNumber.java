// Last updated: 22/10/2026, 21:28:50
1class Solution {
2    public int missingNumber(int[] nums) {
3
4        Arrays.sort(nums);
5
6        //int a = nums[nums.length];
7
8        for(int i=0;i<nums.length ;i++){
9
10            if (i != nums[i]){
11
12                return i;
13            }
14
15
16
17
18
19
20        }
21
22        return nums.length;
23        
24    }
25}