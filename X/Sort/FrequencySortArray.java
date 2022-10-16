package Sort;

import java.util.Scanner;

public class FrequencySortArray {
    static Scanner sc=new Scanner(System.in);

    public static void main(String ... args){
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        a=SortFreq(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"");
        }
    }

    public static int greatest(int a[]){
        int g=0;
        for(int i=0;i<a.length;i++){
            if(g<a[i])
                g=a[i];
        }
        return g;
    }
    public static int[] SortFreq(int a[]){
        int[] sarr=new int[a.length];
        int g=greatest(a);
        int[] count=new int[g+1];
        for(int i=0;i<a.length;i++){
            if(count[a[i]]==0){
                count[a[i]]=1; 
            }
            else{
                count[a[i]]+=1;
            }
        }
        g=greatest(count);


        for(int i=0;i<count.length;i++){
            if(count[i]==g){
                while(g>-1)
                    sarr[g]=i;
            }            
        }

        return sarr;
    }
    
}
