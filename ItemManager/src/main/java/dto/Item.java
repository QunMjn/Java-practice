 package dto;
import java.util.Scanner;
public class Item {
private int value;
private String creator;

public Item(){   
}
public Item(int value,String creator){
    this.value = value;
    this.creator = creator;
}
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public String getCreator(){
        return creator;
    }
    public void setCreator(String creator){
       this.creator = creator;
    }
    // input
    public void input(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
    // value 
   do {
            try {
                System.out.print("Value: ");
                value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Value is not valid!");
            }
        } while (!isValid);
        //CREATOR
        isValid = false;
        do {
            try {
                System.out.print("Creator: ");
                creator = scanner.nextLine();
                if (creator.isEmpty()) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Creator is not valid!");
            }
        } while (!isValid);

    }
    public void output(){
        System.out.println("Value" + value);
        System.out.println("Creator"+ creator);
    }
    
    
}