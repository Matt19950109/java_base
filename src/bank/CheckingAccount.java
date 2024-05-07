package bank;

class CheckingAccount extends Account {
    private double transactionFee;

    public CheckingAccount(String ownerName, String accountNumber, double balance, double transactionFee) {
        super(ownerName, accountNumber, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + transactionFee);
    }
}
