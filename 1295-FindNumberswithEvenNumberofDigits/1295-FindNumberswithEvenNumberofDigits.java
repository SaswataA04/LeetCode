// Last updated: 28/07/2026, 17:51:09
1class Solution {
2    public int findNumbers(int[] nums) {
3        int even_count=0;
4
5        for (int i=0; i<nums.length;i++){
6            int temp = nums[i];
7             int digit_count = 0;
8
9
10            while(temp!=0){
11                temp= temp /10 ;
12                digit_count ++;
13}
14            if (digit_count % 2 == 0 ) {even_count++;}
15        }
16 return even_count;
17        
18    }
19}