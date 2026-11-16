class Solution {
    public int[] getConcatenation(int[] nums) {
        int tam = nums.length;
        int[] ans = new int[tam*2];
        for(int i = 0; i<tam; i++){
            ans[i] = nums[i];
        }
        for(int j = tam; j<tam*2; j++){
            ans[j] = nums[j-tam];
        }
        return ans;
    }
}