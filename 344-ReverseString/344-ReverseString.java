// Last updated: 22/10/2026, 11:44:06
1class Solution {
2    public void reverseString(char[] s) {
3        int slow =0;
4        char temp;
5
6
7        for (int fast = s.length-1 ; fast>slow ; fast--){
8
9            temp = s[slow];
10            s[slow ] = s[fast];
11            s[fast] = temp;
12
13
14            slow++;
15        } 
16
17        
18    }
19}