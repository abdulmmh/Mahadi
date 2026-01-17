package Jan16And17.monthlyevidencepractice.customException;


public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message) {
        super(message);
    } 
}

class Account{
    private long accountNumber;
    private String accountHolder;
    private double balance;

    public Account(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void setInterest(){
        double interestRate = 0.05;
        balance = balance + (balance * interestRate);
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double  amount)throws InsufficientBalanceException{
        if (amount <= balance) balance -= amount;
        else throw new InsufficientBalanceException("Insufficient balance");
    }
}

class Main{
    public static void main(String[] args) {
        Account rahim = new Account(1232452352, "Mr. Rahim", 150000.00);
        
        rahim.deposit(50000);
        rahim.setInterest();
        
        try {
             rahim.withdraw(50000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Final Balance: " + rahim.getBalance());
    }
}