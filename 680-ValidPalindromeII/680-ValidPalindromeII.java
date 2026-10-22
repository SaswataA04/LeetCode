// Last updated: 22/10/2026, 17:39:36
1class Solution {
2
3    public boolean validPalindrome(String s) {
4
5        // Initialize two pointers:
6        // 'left' starts at the beginning of the string.
7        // 'right' starts at the end of the string.
8        int left = 0;
9        int right = s.length() - 1;
10
11        // Continue comparing characters while the pointers
12        // have not crossed each other.
13        while (left < right) {
14
15            // If the characters at both ends are equal,
16            // this pair does not need any deletion ....ujust move the both pointers
17            if (s.charAt(left) == s.charAt(right)) {
18
19                // Move the left pointer one position forward.
20                left++;
21
22                // Move the right pointer one position backward.
23                right--;
24
25            } else {
26
27                // A mismatch has occurred.
28                // We are allowed to delete at most one character.
29                //
30                // Option 1:
31                // Skip the character at 'left' and check whether
32                // the remaining substring is a palindrome.
33                //
34                // Option 2:
35                // Skip the character at 'right' and check whether
36                // the remaining substring is a palindrome.
37                //
38                // If either option works, return true.
39                return isPalindrome(s, left + 1, right)
40                    || isPalindrome(s, left, right - 1);
41            }
42        }
43
44        // If no mismatch was found, the string is already
45        // a palindrome, so no deletion is necessary.
46        return true;
47    }
48
49
50    // Helper method:
51    // Checks whether the substring from index 'left'
52    // to index 'right', inclusive, is a palindrome.
53    //
54    // This method does NOT delete any characters.
55    // It simply checks the specified range.
56    private boolean isPalindrome(String s, int left, int right) {
57
58        // Compare characters from both ends of the specified range.
59        while (left < right) {
60
61            // If the two characters match, move inward.
62            if (s.charAt(left) == s.charAt(right)) {
63
64                left++;
65                right--;
66
67            } else {
68
69                // A mismatch means this substring is not
70                // a palindrome.
71                return false;
72            }
73        }
74
75        // All character pairs matched.
76        // Therefore, the substring is a palindrome.
77        return true;
78    }
79}