// Last updated: 22/10/2026, 12:59:19
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3
4
5
6//this has time complexity 0 n (logn )
7
8        for (int i =0 ; i< nums.length ;i++ ){
9
10            nums[i] = nums[i] * nums[i];
11        }
12        
13        Arrays.sort(nums);
14
15
16      return nums;
17
18        
19    }
20}