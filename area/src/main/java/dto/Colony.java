package dto;


public class Colony extends Organization {
    protected String place;

    public Colony(){}

    public Colony(int size, String place){
        this.size = size;
        this.place = place;
    }
    public void grow(){
        System.out.print("An annual cycle of growth that begins in spring. ");
    }
    public void reproduce(){
        System.out.print("Colony can reproduce itself through a process. ");
    }
    
    @Override
    public void communicateByTool(){
      System.out.println("The colony communicate by sound.");
    }

    @Override
    public String toString(){
        return "The colony size is" + size + "\nThe colony's place is" + place;
    }
}