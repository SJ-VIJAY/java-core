package immutableClass;

final class BankAcc{
    private final String name;
    private final int accNo;
    private final double balance;

    public BankAcc(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }
}
public class Immutable {
    public static void main(String[] args) {
        BankAcc ba = new BankAcc("Vijay",12345678,20500);
        BankAcc ba1 = new BankAcc("Vinu",98765432,24500);

        System.out.println("Account Holder Name: "+ba.getName());
        System.out.println("Account Number: "+ba.getAccNo());
        System.out.println("Account Balance: "+ba.getBalance());
        System.out.println("--------------");
        System.out.println("Account Holder Name: "+ba1.getName());
        System.out.println("Account Number: "+ba1.getAccNo());
        System.out.println("Account Balance: "+ba1.getBalance());

    }
}
