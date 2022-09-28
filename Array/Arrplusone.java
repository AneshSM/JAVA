package Array;
import DSpackage.*;
import java.util.Arrays;
import java.util.Scanner;

class Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = DSpackage.CreateArray(n);
        int ARR[] = new int[plusone1ms(a).length];
        ARR = plusone1ms(a);
        DSpackage.printArray(ARR);
    }

    // public static int[] plusone(int[] a) {
    //     for(int i=a.length;i>=0;i--)
    //         if(a[i]-1==9)
    //             a[i]=0;
    //         else{
    //             a[i]++;
    //             return a;
    //         }
    //     a=new int[a.length+1];
    //     a[0]=1;
    //     return a;
    // }

    public static int[] plusone1ms(int[] a){
        int n=a.length-1;
        while(n>0){
            if(a[n]!=9){
                a[n]++;
                break;
            }
            else{
                a[n]=0;
                n--;
            }
        }
        if(a[0]==0){
            int []b=new int[a.length+1];
            b[0]=1;
            for(int i=1;i<b.length;i++)b[i]=a[i-1];
            return b;
        }
        return a;
    }
}