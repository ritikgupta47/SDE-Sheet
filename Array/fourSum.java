import java.util.*;

class fourSum {
    public List<List<Integer>> fourSumm(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long remTarget = (long)target -(long)nums[i] - (long)nums[j];
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int twoSum = nums[left] + nums[right];
                    if (twoSum < remTarget) left++;
                    else if (twoSum > remTarget) right--;
                    else {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        ans.add(quad);
                        while (left < right && nums[left] == quad.get(2)) left++;  //skips duplicate
                        while (left < right && nums[right] == quad.get(3)) right--; //skips duplicate
                    }
                }
                //skips duplicate
                while (j + 1 < n && nums[j] == nums[j + 1]) j++;
            }
            //skips duplicate
            while (i + 1 < n && nums[i] == nums[i + 1]) i++;
        }
        return ans;
    }
}