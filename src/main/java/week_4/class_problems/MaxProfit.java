package week_4.class_problems;
import java.util.Scanner;
public class MaxProfit {
    static int maxProfit(int[] prices){
        int min_price = prices[0];
        int profit = 0;
        int a,b;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_price){
                min_price = prices[i];
                a = i;
            }
            if(prices[i]-min_price>profit){
                profit = prices[i]-min_price;
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = sc.nextInt();
        int[] prices = new int[size];
        System.out.print("prices= ");
        for (int i=0;i<size;i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));

    }
}
