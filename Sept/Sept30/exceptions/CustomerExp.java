package Sept.Sept30.exceptions;

public class CustomerExp {

    public static void main(String[] args) throws InsufficientFundsException {

        BankAccount jp = new BankAccount(100);
        jp.withdraw(120);
        jp.printBalance();



    }
}


class InsufficientFundsException extends Exception{   // create your own customized exception.
    public InsufficientFundsException(){  // declare constructor
        super();
    }
    public InsufficientFundsException(String message){  // declare constructor
        super(message);
    }

}

class AccountErrorException extends Exception{  // create your own customized exception.
    AccountErrorException(String e){
        super(e);
    }
}


class BankAccount{
    private double balance;  // make the balance private

    public BankAccount(double balance){  // constructor
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {  // add 'Throws' to handle exception.

        if(balance < amount){
            throw new InsufficientFundsException("You don't have balance");
        }
        balance -= amount;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
}