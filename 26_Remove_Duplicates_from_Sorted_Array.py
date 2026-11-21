class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        write = 1
        read  = 1


        while read < len(nums):
            if nums[read] != nums[write]:

                nums[write] = nums[read]
                print(nums[write])
                print(nums[read])
                write = write + 1

            read = read + 1

        return write

if __name__ == "__main__":
    nums = [0,0,1,1,1,2,2,3,3,4]

    solution = Solution()
    k = solution.removeDuplicates(nums)

    print(k)