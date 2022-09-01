import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class IPaddress {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String pattern="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String p=pattern+"\\."+pattern+"\\."+pattern+"\\."+pattern;
        Scanner sc=new Scanner(System.in);
        String str;
        while(sc.hasNext()){    
             str=sc.nextLine();
            if(Pattern.matches(p,str)){
                System.out.println("true");
            }else if(!Pattern.matches(p,str))  
                System.out.println("False");
        }
    }
}