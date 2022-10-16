package Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FndSingleEle {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[]a=DSpackage.CreateArray(n);
        System.out.println(findSingleByArray(a));
        System.out.println(findSingleByHashMap(a));
    }

    public static int findSingleByArray(int[] a){
        int n=0;
        for(int i=0;i<a.length;i++)
            n^=a[i];
        return n;
    }

    public static int findSingleByHashMap(int[] a){
        int b=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i]))
                hm.put(a[i], 1);
            else
                hm.put(a[i],0);           
        }
        for(Map.Entry<Integer,Integer> h:hm.entrySet()){
            if(h.getValue()==0)
                b=h.getKey();
        }
        return b;
    }

}
