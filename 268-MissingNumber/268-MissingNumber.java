// Last updated: 22/10/2026, 22:08:53
1
2class Solution {
3    public int missingNumber(int[] nums) {
4
5        int sum1 = 0;  // Stores the expected sum of numbers from 0 to n
6        int sum2 = 0;  // Stores the actual sum of elements in the array
7        int diff = 0;  // Stores the missing number
8
9        // Time Complexity: O(n)
10        // Space Complexity: O(1)
11
12        int a = nums.length;  // n is the length of the array
13
14        // STEP 1: Calculate the expected sum
15        // The numbers should range from 0 to n, inclusive.
16        // Example: If n = 3, expected numbers are 0, 1, 2, 3.
17        // Expected sum = 0 + 1 + 2 + 3 = 6.
18
19        // this for loop can be replaced by -->   sum1 = (a * (a + 1)) / 2;
20
21        for (int x = 0; x <= a; x++) {
22            sum1 += x;
23        }
24
25
26
27
28        // STEP 2: Calculate the actual sum
29        // Add all the elements present in the given array.
30        // Example: nums = [3, 0, 1]
31        // Actual sum = 3 + 0 + 1 = 4.
32
33        for (int i = 0; i < nums.length; i++) {
34            sum2 += nums[i];
35        }
36
37        // STEP 3: Find the missing number
38        // Missing number = Expected sum - Actual sum.
39        // Example: 6 - 4 = 2.
40
41        diff = Math.abs(sum1 - sum2);
42
43        // STEP 4: Return the missing number
44        return diff;
45    }
46}
47