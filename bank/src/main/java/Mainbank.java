
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Mainbank {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("180398",1000.0);
        
        int choice = 0;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1.INFOR");
            System.out.println("2.DEPOSIT");
            System.out.println("3.WITHDRAW");
            System.out.println("4.CANCEL");
             System.out.println("choose 1 option:");
             choice = scanner.nextInt();
             switch(choice){
                 case 1:
                      System.out.println("ID: "+ customer.getId());
                      System.out.println("REMAINS: "+ customer.getBalance());
                      break;
                 case 2:
                      System.out.println("nhap so tien muon nap : ");
                      double depositAmount = scanner.nextDouble();
                              customer.deposit(depositAmount);
                      System.out.println("DEPOSIT SUCCESSFULLY");
                      System.out.println("ID: "+ customer.getId());
                      System.out.println("REMAINS: "+ customer.getBalance());
                      break;
                  case 3:
                      System.out.println("nhap so tien muon rut : ");
                      double withdrawAmount = scanner.nextDouble();
                              customer.withdraw(withdrawAmount);
                              System.out.println("WITHDRAW SUCCESSFULLY");
                      System.out.println("ID: "+ customer.getId());
                      System.out.println("REMAINS: "+ customer.getBalance());
                      break;
                  case 4:
                      System.out.println("CANCLE");
                      break;
                  default:
                      System.out.println("Lua chon khong hop le , vui long thu lai!");
                      break;
                      
             }
        }while(choice != 4);
    }
}
