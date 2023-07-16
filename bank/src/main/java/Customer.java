/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
  public class Customer {
    private final String id ;
    private double balance;
  public Customer(String id,double balance){
      this.id = id;
      this.balance = balance;
  }
  public String getId(){
      return id;
  }
  public double getBalance(){
      return balance;
  }
  
public void deposit(double amount){
    balance += amount;
}
public void withdraw(double amount){
    if(amount <= balance){
        balance -= amount;
    }else {
        System.out.println("So du ko du ");
    }
  }
}
