public class CardPayment implements Payment{
    private String number;
    private int amount;

    void setnumber(String number)
    {
        this.number=number;

    }
    void setamount(int amount)
    {
        this.amount=amount;
    }

    public void payAmount()
    {
        System.out.println(number+" "+amount);
    }
}

