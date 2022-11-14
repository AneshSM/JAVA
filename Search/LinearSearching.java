package Search;
public class LinearSearching {
    public static PosVal LSearch(int[] a,int x){
        PosVal obj=new PosVal();   
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                obj.setPos(i);
                obj.setValue(a[i]);
                break;
            }
        }
        return obj;
    } 
}
