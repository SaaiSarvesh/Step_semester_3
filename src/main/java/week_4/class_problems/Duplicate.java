package week_4.class_problems;
import java.util.Scanner;

public class Duplicate {
    boolean containsDuplicate(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = sc.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        Duplicate obj = new Duplicate();
        System.out.print(obj.containsDuplicate(nums));
    }
}
