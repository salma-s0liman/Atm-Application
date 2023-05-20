/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Salma Soliman
 */
public class Registration {
    private String firstName;
    private String lastName;
    private String emailAddress;
    static double balance;
    int id;
    int password;
   
    public Registration() {
    }

    public Registration(String firstName, String lastName, String emailAddress, double balance, int id, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.balance = balance;
        this.id = id;
        this.password = password;
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
 
     public double getBalance() {
        return balance ;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    public int getId() {
        return id = 1234567;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getPassword() {
        return password = 1234;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
   public void display(){
       id= (int)(10000000+Math.random()*999999999);
       password = (int)(100+Math.random()*9999);
       System.out.println("Your Id is : " + id);
       System.out.println("your password is : " + password);
   
   }
    
}






