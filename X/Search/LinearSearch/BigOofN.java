package Search.LinearSearch;

import java.util.Scanner;

 public class BigOofN {

    static Scanner sc=new Scanner(System.in);
    public static int[] CreateArr(int n){
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        return a;
    }
    public static String searchE(int[]a,int e){
        String s="false";
        for(int i=0;i<a.length;i++){
            if(a[i]==e){
                s.replaceAll(s, "");
                s=""+(i+1);
            }
        }
        return s;
    }
    public static void main(String... args){
        int n=sc.nextInt();
        int []a=new int[n];
        a=CreateArr(n);
        String s;
        int e=sc.nextInt();//508
        s=searchE(a,5);
        if(s.equals("flase")){
            System.out.println("Not found");
        }
        else
            System.out.println(s);
    }
}
