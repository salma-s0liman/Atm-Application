/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;
import java.util.*;

public class Registration {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long balance;
    private String password;
    private long id;
   
    public Registration() {
    }

    public Registration(String firstName, String lastName, String emailAddress, long balance, String password, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.balance = balance;
        this.password = password;
        this.id = id;
    }

   
   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
 
     public long getBalance() {
        return balance=20000;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    
    
    public long getId() {
        return id=1234567;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getPassword() {
        return password=12345;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   public void display(){
       id= (long)(Math.random()*1000000000);
       password = (int)(100+Math.random()*9999);
       System.out.println("Your Id is : " + id);
       System.out.println("your password is : " + password);
   
   }
    
}






