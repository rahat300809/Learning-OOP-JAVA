public class test {
    public static void main(String[] args) {
        Bankacc bank=new Bankacc(0);
        bank.PayBill(1000);
        bank.refund(500);

        System.out.println("Final balance: "+bank.balance);
         

    }
}
