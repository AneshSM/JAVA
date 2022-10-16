package Array;
import DSpackage.*;
import java.util.Scanner;
class BuySellStocksProfit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=DSpackage.CreateArray(n);
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] a) {
        int profit=0;
        for(int i=0;i<a.length;i++){
            profit+=Math.max(a[i+1]-a[i], 0);
        }
        return profit;
    }
}