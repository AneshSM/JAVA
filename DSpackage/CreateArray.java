package DSpackage;

import java.util.Scanner;
public class CreateArray{
    static Scanner sc=new Scanner(System.in);
    @oOverride
    public int[] createArray(int n){
        int a[]=new int[n]; 
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        return a;
    }
    @oOverride
    public int[] createArrayRandomV(int n,int limit){
        int a[]=new int[n]; 
        Random r=new Random();
        for(int i=0;i<n;i++)
            a[i]=r.nextInt(limit);
        return a;
    }
    @oOverride
    public void printArray(int a[]){
        for(int i:a)
            System.out.print(i+" ");
    }
}
