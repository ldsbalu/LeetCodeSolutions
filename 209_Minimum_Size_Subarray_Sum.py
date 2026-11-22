class Solution(object):
    def minSubArrayLen(self, target, nums):
        best_length = float("inf")
        left = 0
        window_sum = 0

        for right in range(len(nums)):
            window_sum += nums[right]

            while window_sum >= target:
                best_length = min(best_length, right - left + 1)
                window_sum -= nums[left]
                left += 1
        if best_length == float("inf"):
            return 0
        return best_length



if __name__ == "__main__":

    target = 7
    nums = [2,3,1,2,4,3]


    solution = Solution()
    final = solution.minSubArrayLen(target, nums)

    print(final)