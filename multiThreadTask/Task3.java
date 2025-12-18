package multiThreadTask;


class InvalidAmountEnteredException extends RuntimeException{
    public InvalidAmountEnteredException(String message){
        super(message);
    }
}
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class BankAccount {
    double balance = 10000;

    synchronized void deposit(String name, double amount) {
        System.out.println("Welcome: " + name + " Deposit amount :" + amount+" RS");
        try {
            Thread.sleep(2000);
            if (amount > 0) {
                System.out.println("please wait your deposit is under process.. ");
                System.out.println("Deposit amount " + amount);
                Thread.sleep(1000);

                System.out.println("Your deposit :" + amount + " Rs is successful...");
                balance = balance + amount;
                System.out.println("Current balance:" + balance);
                System.out.println(">>>>>>>>>>>>>");
            } else {
                throw new InvalidAmountEnteredException("please deposit more than 0 RS");
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void withdraw(String name, double amount) {
        System.out.println("Welcome: " + name + " Withdraw amount :" + amount);
        try {
            System.out.println(name + " trying to withdraw the amount..");
            Thread.sleep(2000);
            if (amount >= 100 && amount <= balance) {
                System.out.println("please wait your transaction is under process... ");
                Thread.sleep(1000);
                System.out.println("you withdrawal " + amount + " Rs From your account");
                balance = balance - amount;
                System.out.println("Your current balance is: " + balance+" Rs");
                System.out.println("Thank You " + name + "... Welcome Again");
                System.out.println(">>>>>>>>>>>>>");
            } else {
                throw new InsufficientBalanceException("enter valid amount below: " + balance);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
        class Gpay extends Thread {
            BankAccount ob;
            String name;
            double amount;

            public Gpay(BankAccount ob, String name, double amount) {
                super(name);
                this.ob = ob;
                this.name = name;
                this.amount = amount;
            }

            public void run() {
                ob.deposit(name, amount);
            }

        }
        class PhonePay extends Thread {
            BankAccount ob;
            String name;
            double amount;

            public PhonePay(BankAccount ob, String name, double amount) {
                super(name);
                this.ob = ob;
                this.name = name;
                this.amount = amount;
            }

            public void run() {
                ob.withdraw(name, amount);
            }

        }


public class Task3{
    public static void main(String[] args) {
        BankAccount ob = new BankAccount();
        Gpay thread1 = new Gpay(ob,"Vijay",100);
        Gpay thread2 = new Gpay(ob,"Vinu",500);
        PhonePay thread3 = new PhonePay(ob,"Gokul",30000);
        Gpay thread4 = new Gpay(ob,"Seenu",5000);
        PhonePay thread5 = new PhonePay(ob,"Vijay",2000);
        Gpay thread6 = new Gpay(ob,"Tamizh",5000);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

    }

}