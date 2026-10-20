// Last updated: 20/10/2026, 20:44:09
1
2class Solution {
3    public int sortableIntegers(int[] nums) {
4        int n = nums.length;
5
6        int[] prefMax = new int[n + 1];
7
8        for (int i = 0; i < n; i++) {
9            prefMax[i + 1] = Math.max(prefMax[i], nums[i]);
10        }
11
12        int[] suffMin = new int[n + 1];
13        suffMin[n] = Integer.MAX_VALUE;
14
15        for (int i = n - 1; i >= 0; i--) {
16            suffMin[i] = Math.min(nums[i], suffMin[i + 1]);
17        }
18
19        int[] prefDrop = new int[n];
20
21        for (int i = 1; i < n; i++) {
22            prefDrop[i] = prefDrop[i - 1];
23
24            if (nums[i - 1] > nums[i]) {
25                prefDrop[i]++;
26            }
27        }
28
29        int answer = 0;
30
31        for (int d = 1; d <= n / d; d++) {
32            if (n % d == 0) {
33                if (isSortable(nums, prefMax, suffMin,
34                               prefDrop, d)) {
35                    answer += d;
36                }
37
38                int other = n / d;
39
40                if (other != d &&
41                    isSortable(nums, prefMax, suffMin,
42                               prefDrop, other)) {
43                    answer += other;
44                }
45            }
46        }
47
48        return answer;
49    }
50
51    private boolean isSortable(
52        int[] nums,
53        int[] prefMax,
54        int[] suffMin,
55        int[] prefDrop,
56        int k
57    ) {
58        int n = nums.length;
59
60        for (int start = 0; start < n; start += k) {
61            int end = start + k - 1;
62
63            int drops = prefDrop[end] - prefDrop[start];
64
65            if (nums[end] > nums[start]) {
66                drops++;
67            }
68
69            
70            if (drops > 1) {
71                return false;
72            }
73
74            
75            if (prefMax[start] > suffMin[start]) {
76                return false;
77            }
78        }
79
80        return true;
81    }
82}
83