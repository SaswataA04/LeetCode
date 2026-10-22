// Last updated: 22/10/2026, 12:14:15
1class Solution {
2    public int removeElement(int[] nums, int val) {
3
4        int slow=0;
5        int temp= 0;
6
7        for ( int fast= 0 ; fast < nums.length ; fast ++  ){
8
9            if (val != nums[fast] ){
10
11                temp = nums[fast];
12                nums[fast ]= nums[slow];
13                nums[slow]= temp;
14
15                slow++;
16
17
18            }
19        }
20
21
22
23
24
25      return slow;  //make sure to return correct var
26    }
27}