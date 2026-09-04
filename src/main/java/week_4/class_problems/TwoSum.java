package week_4.class_problems;
import java.util.Scanner;
public class TwoSum{
     static int[] twosum(int[] nums,int target){
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
        
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int nums[] = new int[n];
    System.out.println("Enter elements of nums: ");
    for(int i=0;i<n;i++){
        nums[i] = sc.nextInt();
    }
    System.out.print("Target = ");
    int target = sc.nextInt();
    int[] result = twosum(nums,target);
    System.out.println("[" + result[0] + " ," + result[1]+"]");
    sc.close();

}
}