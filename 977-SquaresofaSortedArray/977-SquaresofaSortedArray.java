// Last updated: 22/10/2026, 14:23:35
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3
4        // THIS HAS O(n) TC
5
6        int[] sorted_numbers = new int[nums.length]; 
7
8        int slow =0;
9        int k = nums.length-1;
10        int fast = nums.length-1;
11
12while (fast >= slow){
13            if (Math.abs(nums[slow]) > Math.abs(nums[fast])){
14
15
16                sorted_numbers[k]= nums[slow]* nums[slow];
17                slow++;
18
19
20                
21            }
22
23
24            else {
25                                sorted_numbers[k]= nums[fast]* nums[fast];
26                                fast--;
27
28
29
30            }
31
32            k--;
33        
34
35}
36
37
38
39    return sorted_numbers;
40
41        
42    }
43}