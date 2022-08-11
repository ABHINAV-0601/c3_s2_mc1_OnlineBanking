public class SavingsAccount {
    long accountNumber;
    String accountHolderName;
    double accountBalance;
    String accountStatus;

    public double checkBalance(){
        return accountBalance;
    }
    public double creditCash(double amount){
        return accountBalance+ amount;
    }
    public double debitCash(double amount){
        return accountBalance-amount;
    }

}
