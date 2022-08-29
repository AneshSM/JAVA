package Java.Search;

/*
 * Kabir gave you a binary string S and an integer k. Your task is to find the Longest continuous sequence of '0' after repeating the given string K time.
 * 
 * Input format:
44

First line of input contains an integer K. Next line contains a binary string S.

 * Output format:
Print an integer denoting the longest continuous sequence of 0

 * Code constraints:

1<= S.length() <= 50

1 <= K <= 30
 */

import java.util.Scanner;


public class ContinuesSequence {

    
static int countRepeataton(String al,char ch){
    int c=0,g=0;
    for(int i=0;i<al.length();i++){
        if(al.charAt(i)==ch){
            c++;
            if(g<c)
                g=c;
        }else
            c=0;
    }
    return g;
}

    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt(),g=0;
            char ch='0';
            
            if(!(k>=1 && k<=30))
                throw new OutOfRange("K must be within 1<=k<=30");

            String al=sc.next();

            if(!(al.length()>=1 && al.length()<=50))
                throw new OutOfRange("String Length must be within 1<=s.length()<=50");

                g=countRepeataton(al,ch);

            if(al.charAt(0)=='0' && al.charAt(al.length()-1)=='0'){
                if(!(countRepeataton(al, '1')==0)){
                    g=countRepeataton(al.concat(al), '0');
                    System.out.println(g);
                }
                else
                    System.out.println(g*k);
            }
            else
                System.out.println(g);
            sc.close();
        }
        catch(OutOfRange e){
            System.out.println(e.getMessage());
        }
    }
}
class OutOfRange extends Exception {
    public OutOfRange(String str){
        super(str);
    }
}
