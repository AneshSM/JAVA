package Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Holy2highMarks {
    
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String [] args){

        int n=sc.nextInt();
        int []m=new int[n];
        int []c=new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
           
        }
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();  
        }
        System.out.println(getHolydayArr(m,c));
        System.out.println(getHolydayTree(m,c));
    }

    public static int getHolydayArr(int[] m, int[] c) {
        int v=0;

        int []a=new int[m.length];
        for(int i=0;i<m.length;i++){
            a[i]=m[i];
        }
        Arrays.sort(a);
        for(int i=0;i<m.length;i++){
            if(a[a.length-1]==m[i]){
                v+=c[i];
                continue;
            }
            if(a[a.length-2]==m[i]){
                v+=c[i];
                continue;
            }
        }
        return v;
    }

    public static int getHolydayTree(int[] m,int[] c){
        int v=0;

        TreeMap <Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<m.length;i++){
            tm.put(m[i],c[i]);
        }
        v=tm.get(tm.lastKey());
        tm.remove(tm.lastKey());
        v+=tm.get(tm.lastKey());
        return v;
    }

}
