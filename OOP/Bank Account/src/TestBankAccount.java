public class TestBankAccount {
    public static void main(String[] args){
        BankAccount myaccount= new BankAccount();
        myaccount.depositeMoney("checking",100);
        System.out.println("\n");
        myaccount.depositeMoney("saving",200);
        System.err.println("____________________________________________");
        myaccount.withdrawMoney("checking",1000);
        myaccount.withdrawMoney("saving",2000);
    }
}
