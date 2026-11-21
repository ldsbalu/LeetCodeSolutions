public class majorityElement_169 {

    public int majorityElement_169(int[] nums) {
        int count = 0;
        int candidate = 0 ;
        for (int num : nums){
            if (count == 0 ){
                candidate = num;
                count = 1;
            }
            else if(num == candidate){
                count += 1;
            }
            else{
                count-=1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 3};

        majorityElement_169 solution = new majorityElement_169();
        int k = solution.majorityElement_169(nums);

        System.out.println(k);
    }
}