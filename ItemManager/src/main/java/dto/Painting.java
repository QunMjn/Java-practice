package dto;
import java.util.Scanner;
public class Painting extends Item {
   private int height;
   private int width;
   private boolean isWatercolour;
   private boolean isFramed;
  public Painting(){
  }
  public Painting(int height,int width,boolean isWatercolour,boolean isFramed ,int value ,String creator){
      super(value,creator);
      this.height = height;
      this.width = width;
      this.isWatercolour = isWatercolour;
      this.isFramed = isFramed;
  }
  public int getHeight(){
      return height;
  }
  public void setHeight(int Height){
  }
  public int getWidth(){
      return width;
  }
  public void setWidth(int width){
      this.width = width;
  }
  public boolean getIsWaterColour(){
      return isWatercolour;
  }
  public void setisWaterColour(boolean isWaterColour){
  }
  public boolean getisFramed(){
      return isFramed;
  }
  public void setisFramed(boolean isFramed){
      
  }
  //input 
   public void inputPainting(){
     super.input();
     Scanner scanner = new Scanner(System.in);
     boolean isValid = true;
     do{
         try{
             System.out.println("Height: ");
             height = Integer.parseInt(scanner.nextLine());
             if(height <= 0){
                 throw new Exception();
             }
             isValid = true;
         }catch(Exception e){
             System.out.println("Height is not valid");
         }
     } while (!isValid);
     do{
         try{
             System.out.println("Width: ");
             width = Integer.parseInt(scanner.nextLine());
             if(height <= 0){
                 throw new Exception();
             }
             isValid = true;
         } catch(Exception e){
             System.out.println("Width is not valid");
         }
     } while (!isValid);
     //isWaterColour
     isValid = false;
     do{
         try{
             System.out.println("Is water colour: ");
             String s;
             s = scanner.nextLine();
             if(s.isEmpty()){
                 throw new Exception();
             }
             switch (s.toUpperCase()){
                 case "TRUE":
                 isWatercolour = true;
                 break;
                 case "FALSE":
                 isWatercolour= false;  
                 break;
                 default:
                     throw new Exception();
             }
             isValid = true;
         } catch(Exception e){
             System.out.println("Entered value is not valid: ");
         }
     }while (!isValid);
     //isFramed
     isValid = false;
     do{
         try{
             System.out.println("Is Framed ?");
             String s = scanner.nextLine();
             if(s.isEmpty()){
                 throw new Exception();
             }
             switch(s.toUpperCase()){
                 case "TRUE":
                 isWatercolour = true;
                 break;
                 case "FALSE":
                 isWatercolour= false;  
                 break;
                 default:
                     throw new Exception();
             }
             isValid = true;
         } catch(Exception e){
             System.out.println("Entered value is not value ");
         }
     }while (!isValid);
 }
public void outputPainting(){
 super.output();
    System.out.println("Height: " +height); 
    System.out.println("Width: "+width);
    System.out.println("Is water colour: "+ isWatercolour);
    System.out.println("Is Framemd: "+ isFramed);
 }
}
