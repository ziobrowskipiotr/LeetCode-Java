class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 0
        k = 0
        point1 = nums[0]
        while(i<len(nums)-1):
            point2 = nums[i+1]
            if point1 == point2:
                del nums[i+1]
                k+=1
            else:
                i+=1
                point1 = nums[i]
        nums += k*"_"
        return i+1
