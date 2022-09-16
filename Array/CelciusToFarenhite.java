package Array;
import java.util.*;
import java.util.Scanner;
public class CelciusToFarenhite{
    static Scanner sc=new Scanner(System.in);
    
    public static int[] convertCtoF(int[] a){
        double c=0,f=0;

        for(int i=0;i<a.length;i++){
            c=a[i]*(0.18)+32;
            a[i]=(int)c-4*10;
        }
        return a;
    }

    public static void main(String[] args){
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        a=convertCtoF(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}