package account;

public class Account {
    public int accountId;
    public String description;
    public float minBalance;

    public void display(){
        
            System.out.println("The accountId is:"+accountId+"description is:"+description+"and minbalance is :"+minBalance);
    }
}
