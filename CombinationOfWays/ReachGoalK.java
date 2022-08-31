package CombinationOfWays;

import java.util.Scanner;

public class ReachGoalK {
    public static void main(String[] args){
        try{
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] point={3,5,10};

        if(!(k>=1 && k<=1000))
            throw new OutOfRange("Value must be within k>=1 && k<=10000");
        
        System.out.println(numbrOfWays(point,k));
        
        }
        catch(OutOfRange e){
            System.out.println(e.getMessage());
        }
    }

    public static int numbrOfWays(int[] point, int k) {
        int w=0;

        for(int i=0;i<point.length;i++){

            
            
        }

        return w;
    }
}

class OutOfRange extends Exception {
    public OutOfRange(String str){
        super(str);
    }
}
