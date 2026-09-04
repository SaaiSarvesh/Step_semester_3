package week_4.class_problems;
import java.util.Scanner;

public class merge_Sorted_Arrays {
    int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] result = new int[len];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            }
            else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of array1:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of array2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of array2:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        merge_Sorted_Arrays obj = new merge_Sorted_Arrays();
        int[] result = obj.mergeSortedArrays(arr1, arr2);
        System.out.println("Merged array:");
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
