
    package bank;
import java.util.Scanner;

import customer.Customer;
public class Bank {
     public static void main(String[] args) {
        
          Customer cc= new Customer();
          
          cc.login( );
          Scanner scn = new Scanner(System.in);
          System.out.println("Tell initial balance");
          cc.Balance=scn.nextFloat();
         // System.out.println("PLease select the option "+'\n' +"1.Deposit" +'\n' +"2.Withdrawl"+'\n' +"3.Check balance"+'\n'
           //+ "4.Edit proile" + '\n' +"5.Change password"+'\n'+"6.EXIT");
        
        

           
         do{
            System.out.println("PLease select the option\n1.Deposit\n2.Withdrawl\n3.Check balance+\n4.Edit proile\n5.Change password\n6.EXIT");
            
            
            int opt = scn.nextInt();

          switch(opt){
              case 1:    
            
             cc.deposit();
               break;
                         
              case 2: 
              
              cc.withdrawl();
              break;
              
  
            case 3:     cc.checkBalance();
                       break;
            case 4:     cc.editProfile();
                        break;
            case 5:    cc.changePassword();
                         break;
          default: System.out.println("Exiting");
        
        
          } 
          System.out.println("do you want to continue? (1/0)");
            
         } while(scn.nextInt()==1);
         
          
        cc.login();
    

     }
}


