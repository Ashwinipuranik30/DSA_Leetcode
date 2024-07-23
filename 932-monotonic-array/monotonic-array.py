class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        comparison = 0 
        for i in range(1, len(nums) ) :
            if(nums[i-1] != nums[i])  :
                if comparison == 0:
                    if(nums[i] - nums[i-1] > 0):
                        comparison = 1
                    else:
                        comparison = -1
                elif comparison == -1:
                    if (nums[i] - nums[i-1] > 0):
                        return False
                elif comparison == 1:
                    if ( nums[i] - nums[i-1] < 0):
                        return False
        return True