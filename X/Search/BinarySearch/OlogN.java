import java.util.Scanner;
import Search.LinearSearch.*;

public class OlogN{
    static Scanner sc=new Scanner(System.in);
    public static void main() {
        int n=sc.nextInt();
        BigOofN b=new BigOofN();
        int []a=new int[n];
        a=b.CreateArr(n);
        SLoopSearch(a);
    }
    public static void SLoopSearch(int[] a){
        int low,mid,high,e;
        low=0;
        high=a.length;

        e=sc.nextInt();

        while(low!=high){
            mid=(low+high)/2;
            if(a[mid]==e){
                e=mid;
                break;
            }
            else if(a[mid]<e){
                high=mid;
            }
            else if(a[mid]>e){
                low=mid;
            }
        }
    }
    public static void Srecursive(){
        
    }
}