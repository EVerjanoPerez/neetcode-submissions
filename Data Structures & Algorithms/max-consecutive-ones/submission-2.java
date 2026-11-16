class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int maxH = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                maxi = 0;
            }else{
                maxi++;
                if(maxi > maxH ){
                    maxH = maxi;
                }
            }
        }
        return maxH;
    }
}
