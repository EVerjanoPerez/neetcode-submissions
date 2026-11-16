class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int>ans;
        int tam = nums.size();
        for(int i = 0; i<tam; i++){
            ans.push_back(nums[i]);
        }
        for(int j = tam; j<2*tam;j++){
            ans.push_back(nums[j-tam]);
        }
        return ans;
    }
};