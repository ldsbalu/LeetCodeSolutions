public class MinimumSizeSubarraySum_209 {

    public int minSubArrayLen(int target, int[] nums) {
        int best_length = Integer.MAX_VALUE;
        int left = 0;
        int window_sum = 0;
        for (int right = 0; right < nums.length; right++){
            window_sum += nums[right];
            while (window_sum >= target){
                best_length = Math.min(best_length, right - left + 1);
                window_sum -= nums[left];
                left += 1;
            }

        }
        if (best_length == Integer.MAX_VALUE ){
            return 0;
        }
        return best_length;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        MinimumSizeSubarraySum_209 solution = new MinimumSizeSubarraySum_209();
        int k = solution.minSubArrayLen(target,nums);

        System.out.println(k);
    }
}
/*
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
 */