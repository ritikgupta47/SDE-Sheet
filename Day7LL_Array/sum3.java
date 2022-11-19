package Day7LL_Array;
import java.util.*;
class sum3 {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans =  new HashSet<>();
        for(int i = 0; i < nums.length - 2 ; i++ ){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                if(nums[j] + nums[k] == -(nums[i])){
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    ans.add(new ArrayList<>(curr));
                    j++;
                    k--;
                }else if(nums[j] + nums[k] > -(nums[i])){
                    k--;
                }else if(nums[j] + nums[k] < -(nums[i])){
                    j++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
