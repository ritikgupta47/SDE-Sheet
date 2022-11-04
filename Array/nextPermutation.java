/*
 * Approach :

1)Linearly traverse array from backward such that ith index value of the array is less than (i+1)th index value. Store that index in a variable.

2)If the index value received from step 1 is less than 0. This means the given input array is the largest lexicographical permutation. 
Hence, we will reverse the input array to get the minimum or starting permutation. 
ELSE
Linearly traverse array from backward. Find an index that has a value greater than the previously found index. Store index is another variable.

3) Swap values present in indices found in the above two steps.

4) Reverse array from index+1 where the index is found at step 1 till the end of the array.

Code :
 */

class nextPermutation {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        findNextPermutation(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void findNextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1)
            return;
        // find breakpoint
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}