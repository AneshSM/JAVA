
import java.io.*;
import java.util.*;

public class SplitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] str=s.split("[\\s!,?._'@]+");
        System.out.println(str.length);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        
        scan.close();
    }
}

