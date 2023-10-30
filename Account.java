// create the account class that will set , get the amount on the accounts
public class Account{
    // set the balance
    private double balance;

    // create the constructor
    public Account(double initialBalance){
        if(initialBalance > 0){
            balance = initialBalance;
        }
    }

    public void credit(double amount){
        balance = balance + amount;
    }

    public double getBalance(){
        return balance;
    }
}