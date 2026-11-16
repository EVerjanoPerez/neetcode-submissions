class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        maxD = -1;
        for i in range(len(arr)-1,-1,-1):
            current = arr[i]
            arr[i] = maxD
            maxD = max(current, maxD)
        return arr    
        