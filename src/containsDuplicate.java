import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[]nums={1,3,5,6,1};
        System.out.println(containsDupe(nums));

    }


    public static boolean containsDupe(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }return false;









        /* for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }return false;
    }*/
    }
}
