// Last updated: 19/10/2026, 15:46:13
1
2class Solution {
3    public int removeDuplicates(int[] nums) {
4
5        // we start from slow = fast = 2 because the first 2 elements
6        // can always be kept, no matter whether they are same or different.
7        // so, we directly start checking from the 3rd element (index 2).
8        
9
10        //this if block means if array has only 1 element , it returns 1. 
11        //Though this is block is omittable and the codee will work even if this if block isnt there .
12        if (nums.length < 2) {
13            return nums.length;
14        }
15
16        int slow = 2;
17        int fast = 2;
18
19        for (fast = 2; fast < nums.length; fast++) {
20
21            // since the array is sorted, duplicates appear consecutively.
22            // we compare the current element (nums[fast]) with the element
23            // at nums[slow - 2], which is 2 positions behind the next write position.
24            //
25            // if both are equal, it means that the valid prefix already contains
26            // 2 occurrences of the current element, so accepting it would make
27            // it the 3rd occurrence. therefore, we skip it.
28            //
29            // if both are different, we can safely accept the current element
30            // and place it at nums[slow], then increment slow.
31
32            // we use slow - 2 instead of fast - 2 because slow tracks the valid
33            // elements, whereas fast traverses the original array.
34            // since some elements may be skipped, fast - 2 might refer to
35            // positions containing elements that were not accepted.
36            // slow - 2 helps us check the valid prefix and determine whether
37            // accepting the current element would exceed the limit of 2 copies.
38
39            if (nums[fast] != nums[slow - 2]) {
40                nums[slow] = nums[fast];
41                slow++;
42            }
43
44            // fast moves forward in every iteration, but slow moves forward
45            // only when an element is accepted.
46        }
47
48        // slow represents the number of valid elements in the modified array.
49        // return slow as k.
50        return slow;
51    }
52}
53
54//documented by saswata