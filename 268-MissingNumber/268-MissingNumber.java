// Last updated: 22/10/2026, 21:41:15
1class Solution {
2    public int missingNumber(int[] nums) {
3
4
5        // TC - n logn
6
7        Arrays.sort(nums);
8
9        //int a = nums[nums.length];
10
11        for(int i=0;i<nums.length ;i++){
12
13            if (i != nums[i]){
14
15                return i;
16            }
17
18
19
20
21
22
23        }
24
25        return nums.length;
26        
27    }
28}