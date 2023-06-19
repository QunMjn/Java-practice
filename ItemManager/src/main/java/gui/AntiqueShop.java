package gui;
import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.Vase;
import java.util.Scanner;
public class AntiqueShop {
    public static void main(String[] args) {
        String[] options = {"Create a Painting","Create a Statue ","Create a Vase","Display the item","Quit"};
        Item item=null;
 int choice;
Scanner scanner= new Scanner(System.in);
 do{
     choice= Menu.getChoice(options);
 switch(choice){
 case 1:{
 item=new Vase();
 ((Vase)item).inputVase(); 
 break; 
 }
 case 2:{
 item =new Statue();
 ((Statue) item).inputStatue(); 
 break;
 }
 case 3:{
 item =new Painting();
 ((Painting) item).inputPainting();
 break;
 }
 case 4:{
 if(item!=null){
 if(item instanceof Vase)
 ((Vase) item).outputVase();
 else if(item instanceof Statue)
 ((Statue) item).outputStatue ();
 else if(item instanceof Painting)
 ((Painting) item).outputPainting (); 
 }else {System.out.println("you need to create an object");
 }
 break;
      }
    }    
  }while(choice<=4 && choice > 0);
 }
}    
