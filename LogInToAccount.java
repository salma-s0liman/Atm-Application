/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

/**
 *
 * @author Time Computer
 */
public class LogInToAccount implements Service{
    

   private int balance=10000;
    private String password="1234 ";
    boolean flag=true;
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    @Override
    public void checkpassword(String password) {
       if(this.password.equals(password)){
           System.out.println("The password is correct");
           this.flag=false;
       }  
       else{
           System.out.println("The password is wrong , please try again!");
       }
    }

    @Override
    public double withDraw(double WithdrawalAmount) {
        if(WithdrawalAmount<=this.balance){
        this.balance-=WithdrawalAmount;
        System.out.println("Your amount is withdrawn");}
 
        else{
        System.out.println("The balance is not enough!");}
        return this.balance;
    }

    @Override
    public double deposit(double depositAmount) {
        this.balance+=depositAmount;
        System.out.println("Your amount is deposited");
        return this.balance;    }

    @Override
    public double checkBalance() {
    return this.balance;
            }
    }