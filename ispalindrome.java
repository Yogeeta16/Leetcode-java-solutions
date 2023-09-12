public class ispalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(345543));
    }
        public static boolean isPalindrome(int x) {
            if (x < 0)
                return false;

            long reversed = 0;
            int y = x;

            while (y > 0) {
                reversed = reversed * 10 + y % 10;
                y /= 10;
            }

            return reversed == x;
        }
   }
