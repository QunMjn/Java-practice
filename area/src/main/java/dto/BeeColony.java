package dto;

public class BeeColony extends Colony implements Role{

    protected String type;
    
    public BeeColony(){}

    public BeeColony(int size,String place,String type){
        super(size, place);
        this.type = type;
    }

    public void createWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public String toString(){
        return "the colony's type is " + type + ", size is about " + size + ", and the place is " + place;
    }
}