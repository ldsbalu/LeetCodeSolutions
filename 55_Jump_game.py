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

    def canJump2(self, nums):
        jumps = 0
        current_end = 0
        farthest = 0
        for i in range(len(nums)-1):
            farthest = max(i + nums[i], farthest)
            if i == current_end:
                jumps += 1
                current_end = farthest
        return jumps








if __name__ == "__main__":

    nums = [2,3,0,1,4]
    solution = Solution()
    k = solution.canJump2(nums)

    print(k)