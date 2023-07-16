public class Vehicle {
private String brand ;
private int price;
public Vehicle(){
    
}
public Vehicle(String brand,int price){
    this.brand = brand;
    this.price = price;
}
public String getBrand(){
    return brand;
}
public int getPrice(){
    return price;
}
public void setBrand(String brand){
    this.brand = brand;
}
public void setPrice(int price){
    this.price = price;
}
@Override
public String toString(){
    return brand + "," + price;
}
}
