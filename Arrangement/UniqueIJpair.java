package Arrangement;

/*
 * Input format:

The first line will consist of a single integer N. The second line consists of N integers A1,A2 ... AN.
 
* Output format: 

Output the total number of unique pairs (Ai,Aj) that can be formed, which will also be the number of special Pikachus.

 * Code constraints:

30

31

1 <= N <= 2*105

1 <= Ai <= 109
 */

import java.util.HashSet;
import java.util.Scanner;

public class UniqueIJpair {
    public static void main(String [] args){
        try {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            HashSet<Integer> hs=new HashSet<>();
            if(n>1 && n<2*Math.pow(10, 5)){
                for(int i=0;i<n;i++){
                    int t=sc.nextInt();
                    if(!(t>1 && t<Math.pow(10, 9)))
                        throw new OutOfRange("Input within 1<=Ai<=10^9");
                    hs.add(t);
                }
                System.out.println(hs.size()*2);
            }else{
                throw new OutOfRange("Input within 1<=n<=2*10^5");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class OutOfRange extends Exception {
    public OutOfRange(String str){
        super(str);
    }
}
