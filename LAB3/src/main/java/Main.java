//Trần Đặng Minh Quân - SE180398
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new Mobile("iPhone XI", 2018, 999.99));
        mobileList.add(new Mobile("iPhone X", 2018, 999.99));
        mobileList.add(new Mobile("Samsung Galaxy S9", 2018, 799.99));
        mobileList.add(new Mobile("iPhone 8", 2017, 699.99));
        mobileList.add(new Mobile("Samsung Galaxy S8", 2017, 599.99));
        mobileList.add(new Mobile("iPhone 7", 2016, 549.99));
        // find products after 2017
        List<Mobile> productsAfter2017 = new ArrayList<>();
        for (Mobile mobile :mobileList){
            if(mobile.getYear() > 2017){
                productsAfter2017.add(mobile);
            }
        }
        System.out.println("Products manufactured after 2017: ");
        for (Mobile mobile : productsAfter2017){
            System.out.println(mobile.getName());
        }
        System.out.println();
        //2 find product with name contains "iphone" and turn it to "samsung"
        for (Mobile mobile : mobileList){
            if(mobile.getName().contains("iPhone")){
                mobile.setName(mobile.getName().replace("iPhone","Samsung"));
            }
        }
        System.out.println("Product after changing 'iPhone' to 'Samsung'");
        for(Mobile mobile : mobileList){
            System.out.println(mobile.getName());
        }
        System.out.println();
         // 3. Sort the list in ascending order of price
        mobileList.sort(Comparator.comparingDouble(Mobile::getPrice));
        System.out.println("Sorted list in ascending order of price:");
        for (Mobile mobile : mobileList) {
            System.out.println(mobile.getName() + " - $" + mobile.getPrice());
        }
    }
}
