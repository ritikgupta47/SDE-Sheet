import java.util.*;

class printAllPermutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, 0, arr);
        System.out.println(ans);
    }

    public static void helper(List<List<Integer>> ans, int idx, int[] nums) {
        if (idx == nums.length) {
            List<Integer> currList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                currList.add(nums[i]);
            }
            ans.add(currList);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(i, idx, nums);
            helper(ans, idx + 1, nums);
            swap(i, idx, nums);
        }
    }

    public static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}