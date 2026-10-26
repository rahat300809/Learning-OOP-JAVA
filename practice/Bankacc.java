class Bankacc {
    double balance;

   
    Bankacc(int balance)
    {
       this.balance=balance;
    }

    void PayBill(double amount)
    {
        balance+=amount;
        System.out.println("Bill paid "+amount);
    }
    void refund(double amount)
    {
        balance-=amount;
        System.out.println("Refund: "+amount);
    }


    
    
}
