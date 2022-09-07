package Sort;
////////////////////////////////////INCOMPLETE//////////////////////////////////////////////////
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class FrequencySort {
    static Scanner sc=new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args){
        int n,greatest=0,smallest=0;
        n=sc.nextInt();
        HashMap<Integer,Integer> table=new HashMap<>();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        } 
        for(int i=0;i<n;i++){
                if(!table.isEmpty()){
                    if(table.containsKey(a[i])){
                        table.replace(a[i], table.get(a[i])+1);
                    }
                    else{
                        table.put(a[i], 1);
                    }
                } 
                else{
                   table.put(a[i], 1); 
                 }
        
        }       
        System.out.println(table); 
       System.out.println(table.values()+" "+table.keySet());
        ArrayList al=new ArrayList<>();
        for (Map.Entry key1 : table.entrySet()) {
            for(Map.Entry key2 : table.entrySet()){
                if(!(key1.getValue().equals(key2.getValue()))){
                    if((int)key1.getValue()>(int)key2.getValue()){
                        greatest=(int)key1.getValue();
                    }else{
                        greatest=(int)key2.getValue();
                    }
                    if((int)key1.getValue()>(int)key2.getValue()){
                        smallest=(int)key2.getValue();
                    }else{
                        smallest=(int)key1.getValue();
                    }
                }
                else{
                    
                    continue;
                }
            }
        }
        for(;greatest>=smallest;greatest--){
            for(Map.Entry k:table.entrySet()){
            if(greatest==(int)k.getValue()){
                int repeat=(int)k.getValue();
                while(repeat!=0){
                System.out.print(k.getKey()+" ");
                repeat--;
                }   
            }
        }
        }
    }
}
   

