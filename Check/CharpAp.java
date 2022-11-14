package Check;
import java.util.Scanner;

public class CharpAp{
    public static String CheckString(String str){
        char[] ch=str.toCharArray();
        String s="";
        for(int i=1;i<ch.length-1;){
            if(ch[i]!='+' && ch[i]!='='){
                if(ch[i-1]!='+' || ch[i+1]!='+'){
                    return "false";
                }
                s="true";
                i=i+2;
            }
            else{
                i++;
            }
        }
        if(str.charAt(0)!='+' && str.charAt(0)!='=')s="false";
        if(str.charAt(ch.length-1)!='+' && str.charAt(ch.length-1)!='=')s="false";
        return s;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println(CheckString(sc.nextLine()));
    }
}