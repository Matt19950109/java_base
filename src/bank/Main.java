package bank;

public class Main {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount("Jane Doe", "CA654321", 2000.0, 2.0);
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(100.0);
        System.out.println("After withdrawal, Checking Account Balance: $" + checkingAccount.getBalance());
    }
}
