class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i, j, k = 0, 1, 0
        while(j<len(nums)):
            if nums[i] == nums[j]:
                del nums[j]
                k+=1
            else:
                i+=1
                j+=1
        nums += k*"_"
        return j
