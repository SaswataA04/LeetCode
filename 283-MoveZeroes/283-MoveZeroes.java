// Last updated: 18/10/2026, 14:43:20
1class Solution {
2    public void moveZeroes(int[] nums) {
3
4        int slow =0;
5        int temp =0;
6
7        for (int fast =0 ; fast<nums.length ; fast++){
8
9            if (nums[fast] != 0){
10                //this is basically swapping the nums[slow ] with nums[fast]
11                temp = nums[slow];
12                nums[slow] = nums[fast];
13                nums[fast] = temp;
14
15
16
17                
18                slow++;
19
20            
21
22            }
23        }
24        
25    }
26}