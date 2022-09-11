package Numbers;

import java.util.Scanner;

class Rev{
    
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        int num1=n,rev=0,temp=0;
        while(n!=0){
            temp=n%10;
            rev=rev*10+temp;
            n/=2;
        }
        if(num1>rev)
            System.out.print(-1);
        else
            
    }

}