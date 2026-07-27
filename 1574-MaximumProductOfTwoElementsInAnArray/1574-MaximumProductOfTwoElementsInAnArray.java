// Last updated: 28/07/2026, 04:43:33
class Solution {
    public int maxProduct(int[] nums) {
        int first=0;
        int second=0;

        for (int num : nums){
            if (num > first){
                second = first;
                first = num;
            }
            else if (num > second){
                second = num;
            }
        }
        return (first - 1)*(second-1);
        
    }
}