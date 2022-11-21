import java.util.*;

public class longSubstrWithoutConseqChar {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max = Math.max(set.size() , max);
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
