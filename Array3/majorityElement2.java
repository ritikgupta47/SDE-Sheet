
import java.util.ArrayList;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 2, 2, 2 };
        System.out.println(majorityElement(nums));
    }

    public static ArrayList<Integer> majorityElement(int[] nums) {
        int nums1 = -1;
        int nums2 = -1;
        int c1 = 0;
        int c2 = 0;

        for (int it : nums) {
            if (it == nums1) {
                c1++;
            } else if (it == nums2) {
                c2++;
            } else if (c1 == 0) {
                nums1 = it;
                c1 = 1;
            } else if (c2 == 0) {
                nums2 = it;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums1) {
                c1++;
            }
            if (nums[i] == nums2) {
                c2++;
            }
        }
        if (c1 > nums.length / 3) {
            ans.add(nums1);
        }
        if (c2 > nums.length / 3) {
            ans.add(nums2);
        }
        return ans;
    }
}
