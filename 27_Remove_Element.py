class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        read = 0
        write = 0

        while read < len(nums):
            if nums[read] != val:
                nums[write] = nums[read]
                write += 1

            read += 1
        return write




if __name__ == "__main__":
    nums = [3,2,2,3]
    val = 3

    solution = Solution()
    k = solution.removeElement(nums, val)
    print("Number of keepers:", k)
    print("Modified array:", nums)
    print("Kept values:", nums[:k])

