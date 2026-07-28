// Last updated: 28/07/2026, 18:25:29
class Solution {
    public int findNumbers(int[] nums) {
        int even_count=0;

        for (int i=0; i<nums.length;i++){
            int temp = nums[i];
             int digit_count = 0;


            while(temp!=0){
                temp= temp /10 ;
                digit_count ++;
}
            if (digit_count % 2 == 0 ) {even_count++;}
        }
 return even_count;
        
    }
}