package dto;

public abstract class Organization {
    int size;
    protected Organization(){
    }

    protected Organization(String string){
    }

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public abstract void communicateByTool();

    public String toString(){
        return "The organization's size is" + size;
    }
 
}