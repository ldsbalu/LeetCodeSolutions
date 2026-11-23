import java.util.Arrays;

public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int k = 3;

        RotateArray_189 solution = new RotateArray_189();
        solution.rotate(nums, k);


        System.out.println(Arrays.toString(nums));


    }

}
