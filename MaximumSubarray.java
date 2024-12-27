import java.util.Scanner;
public class MaximumSubarray{
    public static int maxSubArray(int[] nums) {
        int i=0;
        int j=0;
        int sum1=0;
        int max=Integer.MIN_VALUE;
        
            for(j=i;j<nums.length;j++){
                sum1=Math.max(sum1+nums[j],nums[j]);
                max=Math.max(max,sum1);
            }
        
        return max;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] nums=new int[size];
        for (int i = 0; i < size; i++) {
            nums[i]=sc.nextInt();
            
        }
        System.out.println(maxSubArray(nums));
       
        
    }
}