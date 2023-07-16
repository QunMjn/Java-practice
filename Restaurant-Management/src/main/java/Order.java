import java.util.List;
import java.util.ArrayList;
class Order{
    private List <FoodItem> foodItems;
     public Order(){
        foodItems = new ArrayList<>(); 
     }
     public void addFood(FoodItem foodItem){
         foodItems.add(foodItem);
     }
     public void removeFoodItem(FoodItem foodItem) {
        foodItems.remove(foodItem);
    }

    public void editFoodItem(int index, FoodItem newFoodItem) {
        foodItems.set(index, newFoodItem);
    }

    public void printFoodItems() {
        for (FoodItem item : foodItems) {
            System.out.println(item.toString());
        }
    }
    public double calculateTotal(){
        double total = 0.0;
        for(FoodItem item : foodItems){
            total += item.getPrice();
        }
        return total;
    }
    
    public List<FoodItem> getItems() {
        return foodItems;
    }

    public int getItemCount() {
        return foodItems.size();
    }
}
