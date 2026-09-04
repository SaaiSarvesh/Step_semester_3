package week_4.class_problems;
import java.util.Scanner;
public class rotate_Array{
    int[] rotateArray(int[] nums, int k){
        int[] Array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            Array[(i + k) % nums.length] = nums[i];
        }
        return Array;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter elements of nums: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k=sc.nextInt();
        rotate_Array obj = new rotate_Array();
        int arr[] = obj.rotateArray(nums,k);
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i < arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
