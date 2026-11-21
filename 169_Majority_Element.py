class Solution(object):
    def majorityElement(self, nums):
        """
                :type nums: List[int]
                :rtype: int
        """
        count = 0
        for num in nums:
            if count == 0:
                candidate = num
                count = 1
            elif num == candidate:
                count += 1
            else:
                count -= 1

        return candidate



if __name__ == "__main__":

    nums = [2,2,1,1,1,2,2]
    solution = Solution()
    solution.majorityElement(nums)

    print(nums)