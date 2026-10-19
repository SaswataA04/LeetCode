// Last updated: 19/10/2026, 17:02:52
1class Solution {
2    public boolean isPalindrome(String s) {
3
4        
5for (int left = 0, right = s.length() - 1;
6     left < right; ) {
7
8    char l = s.charAt(left); //left char extraction
9    char r = s.charAt(right); // rt char extraction
10
11    // Skip invalid characters on the left
12    //means if these r not the characters in the string , then just skip it &  move to next character 
13    if (!((l >= 'A' && l <= 'Z') || (l >= 'a' && l <= 'z') || (l >= '0' && l <= '9'))) {
14        left++;
15        continue;
16    }
17
18    // Skip invalid characters on the right
19    if (!((r >= 'A' && r <= 'Z') || (r >= 'a' && r <= 'z') || (r >= '0' && r <= '9'))) {
20        right--;
21        continue;
22    }
23
24    //once validation of characters are done now Compare after converting uppercase to lowercase
25    if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
26        return false;
27    }
28    
29
30    // if prev cond is not false , then increase/decrease the pointer and move to next element
31    left++;
32    right--;
33}
34
35return true;
36
37}
38}