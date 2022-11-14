public class sortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int zero = 0;
        int one = 0;
        int two = nums.length-1;
        while(one <= two){
            if(nums[one] == 2){
                swap(nums , one , two);
                two--;
            }else if(nums[one] == 0){
                swap(nums , one , zero);
                zero++;
                one++;
            }else if(nums[one] == 1){
                one++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
