package Search;

public class PosVal {
    int pos=-1;
    int val=-1;
    public PosVal() {
    }
    public PosVal(int pos,int val){
        this.pos=pos;
        this.val=val;
    } 
    public void setPos(int pos){
        this.pos=pos;
    }
    public void setValue(int val){
        this.val=val;
    }
    public int getPos(){
        return this.pos;
    }
    public int getVal(){
        return this.val;
    }
}
