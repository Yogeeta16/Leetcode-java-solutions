import java.util.*;

public class maxSum2815 {
    public static void main(String[] args) {

    }
        public int maxSum(int[] nums) {
            int ans = 0;
            // maxNum[i] := max num we met so far with max digit i
            int[] maxNum = new int[10];

            for (final int num : nums) {
                final int d = getMaxDigit(num);
                if (maxNum[d] > 0)
                    ans = Math.max(ans, num + maxNum[d]);
                maxNum[d] = Math.max(maxNum[d], num);
            }

            return ans == 0 ? -1 : ans;
        }

        private int getMaxDigit(int num) {
            int maxDigit = 0;
            while (num > 0) {
                maxDigit = Math.max(maxDigit, num % 10);
                num /= 10;
            }
            return maxDigit;
        }
    }
