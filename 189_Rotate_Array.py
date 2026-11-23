class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        k %= len(nums)

        for i in range(k):
            previous = nums[-1]
            for j in range(len(nums)):
                nums[j], previous = previous, nums[j]







if __name__ == "__main__":

    nums = [1,2,3,4,5,6,7]
    k = 3
    solution = Solution()
    solution.rotate(nums, k)

    print(nums)