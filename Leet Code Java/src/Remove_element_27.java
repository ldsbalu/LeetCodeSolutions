
import java.util.Arrays;

class Remove_element_27 {
    public int removeElement(int[] nums, int val) {
        int read = 0;
        int write = 0;

        while (read < nums.length) {
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }

            read++;
        }

        return write;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Remove_element_27 solution = new Remove_element_27();
        int k = solution.removeElement(nums, val);

        System.out.println("k: " + k);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println(
                "Kept values: " + Arrays.toString(Arrays.copyOf(nums, k))
        );
    }
}