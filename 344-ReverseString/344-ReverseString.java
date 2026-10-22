// Last updated: 22/10/2026, 11:44:33
1class Solution {
2    public void reverseString(char[] s) {
3        int slow =0;
4        char temp;
5
6
7        for (int fast = s.length-1 ; fast>slow ; fast--){
8            
9
10            //basic swapping
11            temp = s[slow];
12            s[slow ] = s[fast];
13            s[fast] = temp;
14
15
16            slow++;
17        } 
18
19        
20    }
21}