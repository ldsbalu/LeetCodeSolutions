class Solution(object):
    def canJump(self, nums):
        """
                :type nums: List[int]
                :rtype: int
        """
        far = 0
        for i in range(len(nums)):
            if i>far:
                return False
            far = max(far, nums[i]+i)
        return True




if __name__ == "__main__":

    nums = [3,2,1,0,4]
    solution = Solution()
    k = solution.canJump(nums)

    print(k)