// Last updated: 22/10/2026, 17:26:42
1class Solution {
2    public boolean validPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5
6        while (left < right) {
7            if (s.charAt(left) == s.charAt(right)) {
8                left++;
9                right--;
10            } else {
11                return isPalindrome(s, left + 1, right)
12                    || isPalindrome(s, left, right - 1);
13            }
14        }
15
16        return true;
17    }
18
19    private boolean isPalindrome(String s, int left, int right) {
20        while (left < right) {
21            if (s.charAt(left) == s.charAt(right)) {
22                left++;
23                right--;
24            } else {
25                return false;
26            }
27        }
28        return true;
29    }
30}