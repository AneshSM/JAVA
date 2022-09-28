import java.util.Scanner;
public class Triplets {
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int n=sc.nextInt();

        int[] a=DSpackage.CreateArray(n);

        System.out.println("Enter the number");
        int v=sc.nextInt();

        System.out.println("The number of triplets equal to the value "+v+" are:"+checkEqual(a,v));

    }
    public int checkEqual(int a[],int v){
        int k=0;
        Arrays.sort(a);        
        for(int i=0;i<a.length;i++){
            int m=a[i]-v;
            int l=i+1,h=a.length-1;
            while(l<h){
                if(a[h]+a[l]==m){
                    k++;
                    l++;
                    h--;
                }
                else if(a[h])

            }
        }
        
        return k;
    }
}
