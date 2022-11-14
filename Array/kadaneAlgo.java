public class kadaneAlgo {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        if(nums.length == 0){
            System.out.println(0);
        }

        int sum = 0;
        int max = nums[0];
        for(int i = 0;i< nums.length;i++){
            if(sum < 0) sum = 0;
            sum += nums[i];
            max = Math.max(max , sum);
        }
        System.out.println(max);
    }
}
