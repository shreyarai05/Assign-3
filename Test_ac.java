package account;

import java.util.Scanner;

public class Test_ac {
    public static void main(String[] args) {
        Account at= new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("give id");
        at.accountId=sc.nextInt();
    
         
        System.out.println("description");
        at.description = sc.next();
        System.out.println("Minimum balance");
        at.minBalance=sc.nextFloat();
        at.display();
    
         
    }
}

