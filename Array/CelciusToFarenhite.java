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
        int []a=DSpackage.CreateArray(n);
        a=convertCtoF(a);
        DSpackage.printArray(a);
    }
}