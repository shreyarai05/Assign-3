
    package customer;
import java.util.Scanner;
public class Customer {
   public String Name;
    public String Username;
   public String Password;
  public int Age;
  public String SSN;
   public String Address;
    public String Email;
   public long phone;
    public float Balance;
         Scanner scn = new Scanner(System.in);
    public void login( ){
        System.out.println("*****Welcome to ABC Bank Limited*****");
        System.out.println("Enter username");
         Username=scn.nextLine();
        
        System.out.println("Enter password");
         Password = scn.nextLine();
         }
    
    public void deposit(){
        System.out.println("How much to deposit");
        float mn =scn.nextFloat();
        Balance = Balance +mn;
       
        
    

    }
    public  void withdrawl(){
        System.out.println("How much to withdraw");
          float my =scn.nextFloat();
          Balance = Balance -my;
          //System.out.println("do you want to continue?");
          //scn.nextInt();
        
        }
    public void checkBalance(){
            System.out.println("Balance is "+Balance);
            
        
          }
    public void editProfile(){
        System.out.println("profile is editing");
      

    }
    public void changePassword(){
        System.out.println("Tell new password");
        String pw = scn.next();
                Password=pw;
              System.out.println("New password is :"+pw);
            
        
    }
    // public void out(){
       // System.out.println("PLease select the option "+'\n' +"1.Deposit" +'\n' +"2.Withdrawl"+'\n' +"3.Check balance"+'\n'
       // + "4.Edit proile" + '\n' +"5.Change password"+'\n'+"6.EXIT");

      }




