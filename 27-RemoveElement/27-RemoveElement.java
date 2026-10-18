// Last updated: 18/10/2026, 15:28:36
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int slow =0;
4        int temp =0;
5
6        for (int fast=0 ; fast<nums.length ; fast++){
7
8            if ( val !=  nums[fast]){
9
10                temp  = nums[slow];
11                nums[slow] = nums[fast];
12                nums[fast] = temp;
13
14
15
16                slow++; //slow keeps track of unique element 
17
18
19            }
20
21
22        }
23
24        
25
26            return slow; //slow keeps track of unique element 
27
28    }
29}