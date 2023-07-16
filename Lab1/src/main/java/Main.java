/*Trần Đặng Minh Quân
  SE180398
*/

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4, "Petrol");
        car.displayInfo();

        System.out.println();

        Motorbike motorbike = new Motorbike("Honda", "CBR500R", 2021, "500cc");
        motorbike.displayInfo();
    }
}