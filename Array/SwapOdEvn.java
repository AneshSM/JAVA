package Array;

import java.util.Scanner;

public class SwapOdEvn {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[]args){
        int n=sc.nextInt();
        int []a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        a=swapOdEv(a);
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
         }
    }

    public static int[] swapOdEv(int[] a) {
        int mid1=0,mid2=0,n=a.length,temp=0;
        if(a.length%2!=0){
            mid1=(n+1)/2;
            n=n-1;
            for(int i=0;i<mid1-1;i++){
                    temp=n*a[i];
                    a[i]=i*a[n];
                    a[n]=temp;
                    n--;
            }
        }else{
            mid1=n/2-1;
            mid2=n/2;
            for(int i=0;i<mid1;i++){
                    if(n>mid2){
                        temp=a[i]*(n-1);
                        a[i]=a[n-1]*i;
                        a[n-1]=temp;
                        n--;
                    }
            }
        }
    
        return a;
    }
}
