import java.util.Arrays;

public class Valid_palindrome_125 {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }


    public static void main(String[] args) {

        String s ="rascecar";
        Valid_palindrome_125 solution = new Valid_palindrome_125();
        String k = String.valueOf(solution.isPalindrome(s));

        System.out.println(k);

    }
}


