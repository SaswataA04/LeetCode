// Last updated: 28/07/2026, 04:43:37
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
                int m_size=INT_MAX;
                 for(int i=0;i<strs.size();i++){
            if(m_size > strs[i].size()){
                m_size=strs[i].size();
            }
                 }

                 string s="";
        for(int i=0;i<m_size;i++){
            char ch=strs[0][i];
            bool check=true;
            for(int j=0;j<strs.size();j++){
                if(strs[j][i]!=ch){
                    check=false;
                }
            }

if(check){
                s.push_back(ch);
            }else{
                break;
            }
        }
        return s;
        
    }
};