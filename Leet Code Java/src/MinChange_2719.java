public class MinChange_2719 {

    public int minChanges(String s) {
        int changes = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes++;
            }

            i += 2;
        }

        return changes;
    }

    public static void main(String[] args) {
        String s = "1001";

        MinChange_2719 solution = new MinChange_2719();
        int k = solution.minChanges(s);

        System.out.println(k);
    }
}