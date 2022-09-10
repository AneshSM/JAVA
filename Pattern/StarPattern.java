import java.util.*;
import java.io.*;
import java.util.Scanner;
public class StarPattern{
    
    static Scanner sc=new Scanner(System.in);

    public static void rightAngled(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void BrightAngled(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    
    public static void rightAngledMirr(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  
    public static void BrightAngledMirr(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
    
    public static void Triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void TriangleMirr(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            for(int j=n;j>i+1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Diamond(int n){
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Butterfly(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=sc.nextInt();
        // rightAngled(n);
        // BrightAngled(n);
        // rightAngledMirr(n);
        BrightAngledMirr(n);
        // Triangle(n);
        //TriangleMirr(n);
        // // n=n/2;
        // Diamond(n); 
        //Butterfly(n);
    }
}