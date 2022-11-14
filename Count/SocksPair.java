import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class SocksPair {
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args){
        int n=sc.nextInt();
        List<Integer>ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(sc.nextInt());
        }
        System.out.println("The Number of scoks pair Available: "+sockMerchant(n, ar));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i:ar){
                if(hm.containsKey(i))
                    hm.put(i, hm.get(i)+1);
                else
                    hm.put(i, 1);
            }
            n=0;
            for(Map.Entry<Integer,Integer> e:hm.entrySet()){
                n+=e.getValue()/2;
            }
            return n;
    }
}
