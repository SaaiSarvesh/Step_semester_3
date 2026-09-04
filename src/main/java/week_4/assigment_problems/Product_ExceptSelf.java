package week_4.assigment_problems;
import java.util.Scanner;

public class Product_ExceptSelf {
    int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = left;
            left = left * nums[i];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }
        return answer;
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
        Product_ExceptSelf obj = new Product_ExceptSelf();
        int arr[] = obj.productExceptSelf(nums);
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i < arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
