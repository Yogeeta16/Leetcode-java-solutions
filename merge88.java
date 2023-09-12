import java.util.Arrays;

public class merge88 {

    public static void main(String[] args) {

        int nums1[] = {2, 3, 6, 8};

        int m = nums1.length;
        int nums2[] = {1, 4, 7, 9, 10};

        int n = nums2.length;

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }

//    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
//
//        int[] arr = new int[m + n];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < m && j < n) {
//            if (nums1[i] < nums2[j]) {
//                arr[k] = nums1[i];
//                i++;
//                k++;
//            } else {
//                arr[k] = nums2[j];
//                i++;
//                k++;
//            }
//
//        }
//
//        while (i < m) {
//            arr[k++] = nums1[i++];
//        }
//        while (j < n) {
//            arr[k++] = nums2[j++];
//        }
//
//        return arr;
//    }


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1's index (actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (next filled position)

        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
     return nums1;
    }



//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int index=0;
//        for(int i=m;i<m+n;i++) {
//            nums1[i]=nums2[index++];
//        }
//        Arrays.sort(nums1);
    // return nums1;
//    }



}