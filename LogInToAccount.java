
package atm;
import java.util.*;


public class Account extends Registration implements Service{
     
   
    
    public void deposit(int dep){
        this.balance = this.balance + dep;
        System.out.println(dep + " Deposited.");
    }    
    
    public void withDraw(int with){
        Scanner s = new Scanner(System.in);
        while(with>this.balance){
            System.out.println("Insufficient Balance.\nPlease Insert Another Number :  ");
                with = s.nextInt();
        }        
            this.balance = this.balance - with;
            System.out.println(with + " Withdrown.");
        
    }
    
    public void checkBalance(){
        System.out.print("your Balance is : " + this.balance);
    }

   
    
    
}
