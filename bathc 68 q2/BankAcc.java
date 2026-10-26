class BankAcc 
{
    private double balance;

    BankAcc(double balance)
    {
        this.balance=balance;
    }

    void diposite(double amount)
    {
        balance=balance+amount;
    }

    void withdraw(double amount)
    {
        balance-=balance;
    }

    double getbalance()
    {
        return balance;
    }
}