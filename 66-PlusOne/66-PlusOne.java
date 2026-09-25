// Last updated: 25/09/2026, 09:01:26
1class Solution {
2    public int[] plusOne(int[] nums) {
3        
4        
5        for (int i =nums.length-1 ;i>=0; i--){
6
7
8            if (nums[i] <9){
9                nums[i]++;
10                return nums;
11                      }
12
13            else nums[i]=0;         
14
15        }
16
17
18        int[] new_arr = new int[nums.length+1];
19        new_arr[0]=1;
20        return new_arr;
21        
22    }
23}