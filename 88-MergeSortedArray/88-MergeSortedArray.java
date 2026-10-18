// Last updated: 18/10/2026, 21:44:39
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        int i = m-1;
5        int j = n-1;
6        int k = m+n-1;
7
8
9        while (j>=0){  
10            
11            if (i>=0 && nums1[i]>nums2[j]){
12                nums1[k]=nums1[i];
13                i--; 
14            }
15            else {nums1[k] = nums2[j];
16            
17                j--;}
18
19            k--;     
20            
21            
22            
23            } 
24    }
25}