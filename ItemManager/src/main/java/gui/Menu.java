
package gui;
import java.util.Scanner;
public class Menu {
    public static int getChoice(Object[] options){
        for(int i=0;i<options.length;i++){
            System.out.println((i+1) + "-" +options[i]);
        }
        System.out.println("Choose 1 in " +options.length+ ": ");
        Scanner scanner = new Scanner (System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
