//Trần Đặng Minh Quân - SE 180398
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Order order = new Order();
     boolean running = true;
     while (running){
         System.out.println("1.Add food items");
         System.out.println("2.Remove food items");
         System.out.println("3.Edit food item");
         System.out.println("4.Print food items");
         System.out.println("5.calculate total ");
         System.out.println("6.Exist");
         System.out.println("Enter your choice: ");
         
         int choice = scanner.nextInt();
         scanner.nextLine();
         
         switch (choice) {
            case 1:
                 System.out.println("Enter food item name: ");
                 String name = scanner.nextLine();
                 System.out.println("Enter food item price: ");
                 double price = scanner.nextDouble();
                 
                 FoodItem foodItem = new FoodItem(name,price);
                 order.addFood(foodItem);
                 System.out.println("Food item added to order");
               break;
            case 2:
                System.out.println("Enter index of the food item to remove: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                if(index >= 0 && index <order.getItemCount()){
                    FoodItem itemToRemove = order.getItems().get(index);
                    order.removeFoodItem(itemToRemove);
                    System.out.println("Food have been removed from order");
                } else {
                    System.out.println("Inivalid index");
                }
                break;
            case 3:
                System.out.println("Enter index of the food item to edit: ");
                int editIndex= scanner.nextInt();
                scanner.nextLine();
                if (editIndex >= 0 && editIndex <order.getItemCount()){
                    System.out.println("Entern new food item name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new food item price");
                    double newPrice = scanner.nextDouble();
                }else{
                    System.out.println("Invalid index");
                }
                break;
            case 4:
                System.out.println("Food item in order: ");
                order.printFoodItems();
                break;
            case 5:
                double total = order.calculateTotal();
                    System.out.println("Total value of the order: $" + total);
                    break;
            case 6:
                running = false;
                break;
                default:
                    System.out.println("Invalid choice");
                    break;
         }
         System.out.println();
   }
        System.out.println("Existing the program");
 }
}
