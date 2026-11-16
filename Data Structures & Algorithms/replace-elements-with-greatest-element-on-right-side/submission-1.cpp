class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int maxD = -1;
        for(int i = arr.size()-1; i >=0; i--){
            int current = arr[i];
            arr[i] = maxD;
            if(current>maxD){
                maxD = current;
            }
        }
        return arr;
    }
};