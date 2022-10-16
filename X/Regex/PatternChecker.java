import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternChecker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
                String s=sc.nextLine();
                try{
                    Pattern.compile(s);
                    System.out.println("valid");
                }catch(PatternSyntaxException e){
                    System.out.println("invlde");   
                }
        }
    }
}
    