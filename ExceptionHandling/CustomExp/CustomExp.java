package ExceptionHandling.CustomExp;


// we Extend the  Exception means that considered only compile time exception
// means we handle that
class YourLimitHasBeenReached extends Exception {
    public YourLimitHasBeenReached(String msg){
        super(msg);
    }
}
class DepositAmountInvalid extends RuntimeException{
    public DepositAmountInvalid (String msg){
        super(msg);
    }
}
class Bank{
    int balance = 10000;
    int limit = 5000;
    void deposit(int dep){

        try{
            if(dep <= 500){
                throw new DepositAmountInvalid("Deposit Amount should be above 500");
            }
            else {
                balance += dep;
                System.out.println("Deposit was successful...");
                System.out.println("Total amount in account: "+balance);
            }

        }catch (DepositAmountInvalid e){
            System.out.println(e);
        }

    }

    void withdraw(int with) throws YourLimitHasBeenReached{
        if (with > limit){
            throw new YourLimitHasBeenReached("Enter valid amount..");
        }else{
            balance -= with;
            System.out.println("Your withdraw was successful..");
            System.out.println("Your current balance is : "+balance);
        }
    }

}
public class CustomExp {
    public static void main(String[] args) throws YourLimitHasBeenReached {
        Bank bk = new Bank();

        bk.withdraw(6000);
        bk.deposit(100);


    }
}
