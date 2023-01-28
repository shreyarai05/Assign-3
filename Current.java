package account;

public class Current extends Account {
    public Current(){
        minBalance= 0;
    }
        public void display(){
            System.out.println("The accountId is:"+accountId+"description is:"+description+"and minbalance is :"+minBalance);
        }
}
