class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        self.tmp = []
        i = 0
        point1 = nums[0]
        while(i<len(nums)-1):
            point2 = nums[i+1]
            if point1 == point2:
                del nums[i+1]
                self.tmp.append("_")
            else:
                i+=1
                point1 = nums[i]
        nums += self.tmp
        del self.tmp
        return i+1
