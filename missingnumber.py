#Question
#Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

#For example,
#Given nums = [0, 1, 3] return 2.

class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i,ans = 0,0
        l = len(nums)
        while(i < l):
            ans = ans - (nums[i] - i)
            i += 1
        
        return (l+ans)
