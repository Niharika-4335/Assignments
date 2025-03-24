package Collections;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
    int balance;
    public int deposit(int amount){
        balance=balance+amount;
        return balance;
    }
    public void withdraw(int amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("amount should be minimum");
        }
    }
    public static void main(String[] args) {
       CustomExceptionExample customExceptionExample=new CustomExceptionExample();
       System.out.println(customExceptionExample.deposit(1000));
       try{
        customExceptionExample.withdraw(2000);}
       catch(Exception e){
           System.out.print(e.getMessage());
       }
    }
}
