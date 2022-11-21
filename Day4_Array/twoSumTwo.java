public class twoSumTwo {
    public static void main(String[] args) {
        
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        if (numbers == null || numbers.length < 2) return ans;
        while(left < right){
            if(numbers[right] + numbers[left] == target){
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            }else if(numbers[left] + numbers[right] > target){
                right--;
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }
        }
        
        return ans;
    }
}
