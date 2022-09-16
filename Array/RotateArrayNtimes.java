package Array;

import java.util.Scanner;

public class RotateArrayNtimes {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of array elements:");
        int n=sc.nextInt();
        int[] a=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotation required:");
        int k=sc.nextInt();
         // a=rotate(a,k);      
        
         int []b=new int[n];
        for(int i=0;i<n;i++){
            b[(i+k)%n]=a[i];
        }

        for(int i=0;i<n;i++){
            a[i]=b[i];
            System.out.print(" "+a[i]);
        }
        b=null;
        sc.close();
    }

    public static int [] rotate(int[] a, int k) {
        while(k-->0){
            int n=a[a.length-1];
            for(int i=a.length-2;i>=0;i--){
                a[i+1]=a[i];
            }
            a[0]=n;
        }
        return a;
    }

    public static int [] revArr(int[] a,int low,int high){

        while(low<high){

            a[low]^=a[high];
            a[high]^=a[low];
            a[low]^=a[high];
            low++;
            high--;
        }
        return a;
    }

}
