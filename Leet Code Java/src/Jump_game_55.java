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

    public int canJump2(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;

    }


    public static void main(String[] args) {

        int[] nums = {1,1,1,1};
        Jump_game_55 solution = new Jump_game_55();
        int k = solution.canJump2(nums);

        System.out.println(k);

    }
}


