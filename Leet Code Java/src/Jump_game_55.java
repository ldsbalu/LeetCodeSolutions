import java.util.Arrays;

public class Jump_game_55 {
    public boolean canJump(int[] nums) {
        int far =0;
        for(int i = 0; i<nums.length;i++){
            if(i>far){
                return false;
            }
            far = Math.max(far, nums[i]+i);
        }

        return true;
    }


    public static void main(String[] args) {

        int[] nums = {3,1,1,2};
        Jump_game_55 solution = new Jump_game_55();
        boolean k = solution.canJump(nums);

        System.out.println(k);

    }
}


