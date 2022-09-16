package Array;
import java.util.Scanner;
class BuySellStocksProfit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
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