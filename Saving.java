package account;

public class Saving extends Account {
    public Saving(){
        minBalance= 500;
    }
        public void display(){
            System.out.println("The accountId is:"+accountId+" description is:"+description+" and minbalance is :"+minBalance);
}
}
