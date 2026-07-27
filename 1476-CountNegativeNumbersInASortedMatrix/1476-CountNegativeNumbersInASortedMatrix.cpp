// Last updated: 28/07/2026, 04:43:36
class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int count = 0;
        for(int i = 0; i < grid.size(); i++) {
            for(int j = 0; j < grid[i].size(); j++) {
                if(grid[i][j] < 0) {
                    count += grid[i].size() - j;
                    break;
                }
            }
        }       
        return count;
    }
};