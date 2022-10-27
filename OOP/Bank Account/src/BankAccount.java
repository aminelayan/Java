public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    public static int numberOfAccounts;
    public static double totalAmountOfMoney;

    public void BankAccounts() {
        numberOfAccounts++;
    }
    public BankAccount() {
        this.checkingBalance= getCheckingBalance();
        this.savingBalance= getSavingBalance();
        numberOfAccounts++;
        totalAmountOfMoney=(getCheckingBalance() + getSavingBalance());
    }


    public void  depositeMoney (String accountType,double amount) {
        if (accountType == "checking") {
            this.checkingBalance += amount;
            System.out.println("Deposited in Your Checking Balance: " + amount);
            totalAmountOfMoney = (this.checkingBalance + this.savingBalance);
            System.out.println("Total in Your Account: " + totalAmountOfMoney);

        } else if (accountType == "saving") {
            this.savingBalance += amount;
            System.out.println("Deposited in Your Saving Balance: " + amount);
            totalAmountOfMoney = (this.checkingBalance + this.savingBalance);
            System.out.println("Total in Your Account: " + totalAmountOfMoney);
        }
    }

    public void withdrawMoney(String accountType,double amount) {

          if (totalAmountOfMoney<amount){
            System.err.println("No Sufficient Amount");
        }


        else if (accountType == "checking") {
            this.checkingBalance -= amount;
            System.out.println("Withdraw From Your Checking Balance: " + amount);
            totalAmountOfMoney = (this.checkingBalance + this.savingBalance);
            System.out.println("Total in Your Account: " + totalAmountOfMoney);
        }
        else if (accountType == "saving") {
            this.savingBalance -= amount;
            System.out.println("Withdraw in Your Saving Balance: " + amount);
            totalAmountOfMoney = (this.checkingBalance + this.savingBalance);
            System.out.println("Total in Your Account: " + totalAmountOfMoney);
            System.err.println("____________________________________________");
        }
    }


    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }
}
