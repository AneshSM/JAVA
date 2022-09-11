package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueStones {
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]a=new int[m]; 
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
            for(int j=0;j<m;j++){
                if(al.contains(a[j])){
                    al.remove(al.indexOf(a[j]));
                }
            }
        }
        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i));
        // }
        // System.out.println(al.get(0));
        int sum=al.get(0);
        al.remove(al.get(0));
        int setcount=1;
        for(int i=0;i<al.size();i++){
            
            sum+=al.get(i);
            if(sum<=n){
                setcount+=1;    
            }
        }
        System.out.println(setcount);
    }
}
