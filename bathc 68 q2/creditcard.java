public class creditcard implements Payment{

    BankAcc acc;

    creditcard(BankAcc acc)
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
