class Solution(object):
    def removeDuplicates(self, nums):
        i, j = 0, 1
        while(j<len(nums)):
            if nums[i] == nums[j]:
                del nums[j]
            else:
                i+=1
                j+=1
        return j
