
public class MobileBank implements Payment{
    BankAcc acc;
    MobileBank(BankAcc acc)
    {
        this.account=account;
    }

    public void paybill(double amount)
    {

        System.out.println("processing..........");
        account.deposite(amount);
    }

    public void refund(double amount)
    {
        account.withdraw(amount);
       
    }
    
}
