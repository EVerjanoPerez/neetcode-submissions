class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max = 0
        maxH = 0;
        for num in nums:
            if num == 0:
                max = 0
            if num == 1:
                max = max +1
                if max > maxH :
                    maxH = max

        return maxH
        