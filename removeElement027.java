import java.util.Arrays;

public class removeElement027 {
    public static void main(String[] args) {

        int nums1[] = {2,3,3,2};

        int m = 3;
//        int nums2[] = {1, 4, 7, 9, 10};

//        int n = nums2.length;

        System.out.println(removeElement(nums1, m));
    }
    public static int  removeElement(int[] nums, int val) {
        int i = 0;

        for (final int num : nums)
            if (num != val)
                nums[i++] = num;

        return i;
    }

}
