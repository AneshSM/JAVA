import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import DSpackage.*;
public class Triplets {
    static Scanner sc=new Scanner(System.in);
    static List<List<Integer>> al=new ArrayList<>();
    public static void main(String [] args){
        int n=sc.nextInt();
        Arr arr=new Arr();
        int[] a=arr.createArray(n);

        System.out.println("Enter the number");
        int v=sc.nextInt();

        System.out.println("The number of triplets equal to the value "+v+" are:"+checkEqual(a,v).size()+"\nTrilets are:");
        for (List i : checkEqual(a, v)) {
            System.out.println(i);
        }


    }
    public static List<List<Integer>> checkEqual(int a[],int v){
        int k=0;
        ArrayList li=new ArrayList<>();
        Arrays.sort(a);        
        for(int i=0;i<a.length;i++){
            int m=v-a[i];
            int l=i+1,h=a.length-1;
            while(l<h){
                if(a[h]+a[l]==m){
                    li.add(a[i]);
                    li.add(a[l]);
                    li.add(a[h]);
                    al.add(li);
                    k++;
                    l++;
                    h--;
                }
                else if(a[h]+a[l]>m)
                    h--;
                else
                    l--;
            }
        }
        
        return al;
    }
}
