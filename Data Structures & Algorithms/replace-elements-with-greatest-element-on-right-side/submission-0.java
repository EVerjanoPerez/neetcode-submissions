class Solution {
    public int[] replaceElements(int[] arr) {
        int maxD=-1;
        for (int i = arr.length-1 ; i>=0;i--){
            int current = arr[i];
            arr[i] = maxD;
            maxD=Math.max(current, maxD);
        }
        return arr;
    }   
}