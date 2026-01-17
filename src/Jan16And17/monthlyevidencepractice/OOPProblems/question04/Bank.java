package Jan16And17.monthlyevidencepractice.OOPProblems.question04;

import java.util.logging.Level;
import java.util.logging.Logger;


class Bank {
    
    void displayBankName(){
        System.out.println("National Bank Of Bangladesh, Rampura Branch");
    }
}

class Account extends Bank{
   
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws BalanceIsNegative{
        if (balance < 0) {
            throw new BalanceIsNegative("Balance amount should be positive!");           
        } else {
            this.balance = balance;
        }
 
    } 
}

class BalanceIsNegative extends Exception{

    public BalanceIsNegative(String message) {
        super(message);
    } 
}

class Main{
    public static void main(String[] args) {
    
        Account  acc = new Account();
        acc.displayBankName();
        try {
            acc.setBalance(5000000);
            System.out.println("Current balance is " + acc.getBalance());
            
            acc.setBalance(-34567456);
        } catch (BalanceIsNegative ex) {
            System.out.println(ex.getMessage());
        }
    }
}