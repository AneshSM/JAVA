import java.io.*;
import java.util.*;
import java.util.NoSuchElementException;

public class SplitString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner scan = new Scanner(System.in);
        try{
            String s=scan.nextLine();
            // Write your code here.
            s=s.trim();
                String[] str=s.split("[^a-zA-Z]+");
                System.out.println(str.length);
                for(int i=0;i<str.length;i++){
                    System.out.println(str[i]);
                }
                scan.close();
        }
        catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
}
