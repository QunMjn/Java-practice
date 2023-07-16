// Trần Đặng Minh Quân -SE180398
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        
        System.out.println("Enter price: ");
        int price = scanner.nextInt();
        
        System.out.println("Enter color: ");
        int color = scanner.nextInt();
        
        Car car = new Car(brand,price,color);
        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getMarketPrice()");
        System.out.println("Entern TC(1,2,3)");
        int tc = scanner.nextInt();
        scanner.nextLine();
        switch(tc){
            case 1:
                System.out.println("OUTPUT: ");
                System.out.println(car.toString());
                break;
            case 2:
                car.setData();
                System.out.println("OUTPUT: ");
                System.out.println(car.toString());
                break;
            case 3:
                int marketPrice = car.getMarketPrice();
                System.out.println("OUTPUT: ");
                System.out.println(marketPrice);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    
}
