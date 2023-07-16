 class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String brand, String model, int year,int numDoors, String fuelType) {
        super(brand, model, year);
        
    }
     public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
 @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Fuel type: " + fuelType);
    }
    
}
