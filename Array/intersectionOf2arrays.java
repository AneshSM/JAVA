package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class intersectionOf2arrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array A size and ists elements:");
        int n = sc.nextInt();
        int a[] =DSpackage.CreateArray(n);
        System.out.println("Enter array B size and ists elements:");
        int m = sc.nextInt();
        int b[] = DSpackage.CreateArray(n);
        System.out.println("Using Array:");    
        int ARR[]=new int[intersectArray(a, b).length];
        ARR=intersectArray(a, b);
        DSpackage.printArray(ARR);

        System.out.println("\nUsing HashMap:");    
        int HM[]=new int[intersectArray(a, b).length];
        HM=intersectArray(a, b);
        DSpackage.printArray(HM);
    }

    public static int[] intersectHashMap(int[] a, int[] b) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList <Integer> al=new ArrayList<>();
        for (int i : a) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        for(int i:b){
            if (hm.containsKey(i) && hm.get(i)!=0) {
                hm.put(i, hm.get(i) - 1);
                al.add(i);
            }
        }
        int c[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
            c[i]=al.get(i);
        return c;
    }

    public static int[] intersectArray(int[]a,int []b){
        int countArr[]=new int[1001];
        int ans[]=new int[1001];

        for(int i:a)countArr[i]++;

        int count=0;

        for(int i:b){
            if(countArr[i]>0){
                ans[count++]=i;
                countArr[i]--;
            }
        }
        return Arrays.copyOfRange(ans,0,count);
    }
}
