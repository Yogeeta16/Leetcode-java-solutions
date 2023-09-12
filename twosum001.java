import java.util.Arrays;
public class twosum001 {
    public static void main(String[] args) {
        int[] nums = {1, 8, 7, 2, 5};
        int target = 10;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println(Arrays.toString(result));

        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return null;
    }
}


//   public int[] twoSum(int[] nums, int target) {
//     Map<Integer, Integer> numToIndex = new HashMap<>();

//     for (int i = 0; i < nums.length; ++i) {
//       if (numToIndex.containsKey(target - nums[i]))
//         return new int[] {numToIndex.get(target - nums[i]), i};
//       numToIndex.put(nums[i], i);
//     }

//     throw new IllegalArgumentException();
//   }



//   public int[] twoSum(int[] nums, int target) {
//  for(int i = 0 ; i < nums.length - 1 ; i++)
//             for(int j = i + 1 ; j < nums.length ; j++)
//             {
//                 if(nums[i] + nums[j] == target)
//                     return new int[]{i , j };
//             }
//         return new int[]{-1 , -1};
//         }

