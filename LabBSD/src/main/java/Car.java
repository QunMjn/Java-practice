
public class Car extends Vehicle {
    private int color;
    public Car(){
        
    }
    public Car(String brand,int price,int color){
        super(brand,price);
        this.color = color;
    }
    public void setData(){
       String brand = getBrand();
       if(brand.length() > 2){
           String newBrand = brand.substring(0,1) + "XY" +brand.substring(2);
       }else{
           brand += "AA";
           setBrand(brand);
       }
    }
    public int getMarketPrice(){
        if(color % 2 == 1){
        return getPrice() + 1;
        }else{
            return getPrice()+10;
        }
    }
    @Override
    public String toString(){
        return getBrand() + "," + getPrice() + "," + color;
    }
}
