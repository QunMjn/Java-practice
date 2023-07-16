 class Motorbike extends Vehicle {
    private String engineSize;

    public Motorbike(String brand, String model, int year,String engineSize) {
        super(brand, model, year);
        this.engineSize = engineSize;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine size: " + engineSize);
    }
}