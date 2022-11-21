import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int currNum = num;
                int currMax = 1;
                while(set.contains(currNum+1)){
                    currNum += 1;
                    currMax += 1;
                }
                max = Math.max(currMax , max);
            }
        }
        return max;
    }
}