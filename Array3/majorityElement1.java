public class majorityElement1 {
    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,2,2};
        int ans = majorityElement(num);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for(int it : nums){
            if(count == 0){
                num = it;
            }
            if(it == num){
                count++;
            }else{
                count--;
            }
        }
        return num;
    }
}

