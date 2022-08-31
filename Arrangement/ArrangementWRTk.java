package Arrangement;

/*
 * Adhi wants to gift a pot to her father on his birthday and asked for help from her Sister Dia. Dia gives N flower sticks numbered 1 to N to Adhi and tells her to arrange them in the pot in a particular order. He asks her to arrange the first K flower sticks in the order of their increasing length and the remaining sticks in the order of their decreasing length.
 * Your job is to find the final arrangement of the flower sticks in which Adhi gifted the bouquet to his father.
 * 
 * input format:
⚫ num, an integer representing the number of flower sticks (N).

⚫ random, an integer representing the number K given by Dia to Adhi sticks

⚫ a list of integers representing the length of flower sticks.

Fill your code here

You are

2

A

 * Output format:

The output returns a list of integers representing the final pattern of the flower sticks in which Adhi gifted the pot to his father.

 * Code constraints:

0 < num < 106

Random < num
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrangementWRTk{
    public static void main(String[]args){
        try {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int k=sc.nextInt();

                    if(n>0 && n<106 && k<n){
                        ArrayList<Integer> al=new ArrayList<>();
                        for(int i=0;i<n;i++){
                            al.add(sc.nextInt());
                        }
                        Collections.sort(al);
                        for(int i=al.indexOf(k)+1,h=n-1;i<h;i++,h--){
                            int tmp=al.get(h);
                            al.remove(h);
                            al.add(h, al.get(i));
                            al.remove(i);
                            al.add(i,tmp);
                        }
                        for(int v:al){
                            System.out.print(v+" ");
                        }
                    }else{
                        throw new OutOfRange("Input n is supposed to be within 0 and 106 and k < n");
                    }
                    sc.close();
        }
        catch (OutOfRange err) {
            System.out.println(err.getMessage());
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
class OutOfRange extends Exception {
    public OutOfRange(String str){
        super(str);
    }
}