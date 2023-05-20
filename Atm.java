
package atm;
import java.util.*;

public class Atm {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account a1 = new Account();
        Registration a2 = new Registration();
        boolean x = true;
        System.out.println("Welcome to our Bank.");
        System.out.println("Do you have account?");
        String answer = s.next();
        switch(answer){
            case "yes":
                System.out.print("Enter Your id : ");
                    int id = s.nextInt();
                while(id!=a2.id){
                    System.out.println("Wrong Id ,Please try again.");
                    System.out.print("Enter Your id : ");
                        id = s.nextInt();
                }
                System.out.print("Enter Your Password : ");
                    int password = s.nextInt();
                while(password!=a2.password){
                    System.out.println("Wrong Password ,Please try again.");
                    System.out.print("Enter Your password : ");
                        password = s.nextInt();
                }
                 while (x){
           System.out.println("\nEnter 1 To Deposit.\nEnter 2 To Withdraw.\nEnter 3 To Check Blance.\nEnter 4 To Exist.");
           int c = s.nextInt();
           System.out.println();
        
        switch(c){
            case 1 :
                System.out.print("Enter The Deposit : ");
                    double deposit = s.nextInt();
                    a1.deposit(deposit);
            break;
            
            case 2 :
                System.out.print("Enter The Amount You Want To Withdraw : ");
                    double withdraw = s.nextInt();
                    a1.withDraw(withdraw);
            break;
            
            case 3 :
                   a1.checkBalance();

            break;
            
            case 4 :
                System.out.println("Thank You!");
                x = false;
            break;
            
             default:
                 System.out.println(" Invalid Choice,Please Try Again. ");
        }
}
            case "no":
                System.out.print("Enter Your firstname : ");
                    String firstname = s.next();
                    a2.setFirstName(firstname);
                System.out.print("Enter Your lasttname : ");
                    String lastname = s.next();
                    a2.setLastName(lastname);
                System.out.print("Enter Your EmailAddress : ");
                    String EmailAddress = s.next();
                    a2.setEmailAddress(EmailAddress);
                System.out.print("Enter Your Balance : ");
                    double balance = s.nextDouble();
                    a2.setBalance(balance);
                System.out.println("Your Registration is Successful.");
                System.out.println();
                a2.display();
                 while (x){
                    System.out.println("\nEnter 1 To Login.\nEnter 2 To Exist.");
                     System.out.println();
                        int c = s.nextInt();
        
        switch(c){
            case 1 :
                System.out.print("Enter Your id : ");
                    id = s.nextInt();
                while(id!=a2.id){
                    System.out.println("Wrong Id ,Please try again.");
                    System.out.print("Enter Your id : ");
                        id = s.nextInt();
                }
                System.out.print("Enter Your Password : ");
                    password = s.nextInt();
                while(password!=a2.password){
                    System.out.println("Wrong Password ,Please try again.");
                    System.out.print("Enter Your password : ");
                        password = s.nextInt();
                }
                    while (x){                                

                            System.out.println("\nEnter 1 To Deposit.\nEnter 2 To Withdraw.\nEnter 3 To Check Blance.\nEnter 4 To Exist.");
                                int c1 = s.nextInt();
                                System.out.println();
      
                            switch(c1){
                                case 1 :
                                    System.out.print("Enter The Deposit : ");
                                        double deposit = s.nextInt();
                                        a1.deposit(deposit);
                                break;

                                case 2 :
                                    System.out.print("Enter The Amount You Want To Withdraw : ");
                                        double withdraw = s.nextInt();
                                        a1.withDraw(withdraw);
                                break;

                                case 3 :
                                     a1.checkBalance();
                                break;

                                case 4 :
                                    System.out.println("Thank You!");
                                    x = false;
                                break;

                                 default:
                                     System.out.println(" Invalid Choice,Please Try Again. ");

                                    }
                    }
                                break;
            case 2 :
                System.out.println("Thank You!");
                x = false;
            break;
            default:
                System.out.println(" Invalid Choice,Please Try Again. ");
        } 
                 }
        }
    }
}

            
            
