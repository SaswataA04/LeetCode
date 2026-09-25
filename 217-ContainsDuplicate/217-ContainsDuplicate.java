// Last updated: 25/09/2026, 11:08:55
1import java.util.HashSet;
2
3
4class Solution {
5    public boolean containsDuplicate(int[] nums) {
6
7        HashSet<Integer> seen = new HashSet<>();
8
9
10        for ( int i=0; i<nums.length ; i++){
11
12            if (seen.contains(nums[i])){
13                return true;
14            }
15            else seen.add(nums[i]);
16        }
17        return false;
18    }
19}