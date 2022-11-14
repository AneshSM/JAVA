package DSpackage;

import java.util.Random;
import java.util.Scanner;
public class Arr{
    static Scanner sc=new Scanner(System.in);
    public int[] createArray(int n){
        int a[]=new int[n]; 
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        return a;
    }
    public static int[] createArrayRandomV(int n,int limit){
        int a[]=new int[n]; 
        Random r=new Random();
        for(int i=0;i<n;i++)
            a[i]=r.nextInt(limit);
        return a;
    }
    public static void printArray(int a[]){
        System.out.println("Array Elements:");
        for(int i:a)
            System.out.print(i+" ");
    }
}
