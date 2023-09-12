import java.util.*;

public class sumOfSquares2778 {
    public static void main(String[] args) {

    }
        public int sumOfSquares(int[] nums) {
            final int n = nums.length;
            int ans = 0;

            for (int i = 0; i < n; ++i)
                if (n % (i + 1) == 0)
                    ans += nums[i] * nums[i];

            return ans;
        }
    }

