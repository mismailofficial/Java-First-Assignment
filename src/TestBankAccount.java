
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
        BankAccount obj2 = new BankAccount(123, "Ismail");
        BankAccount obj3 = new BankAccount(100, "Ali", 50000f);
        System.out.println(obj1.getBalance());
        System.out.println(obj2.getBalance());
        System.out.println(obj3.getBalance());
        obj1.deposit(500);
        obj2.deposit(6000);
        obj3.deposit(1000f);
        System.out.println(obj1.getBalance());
        System.out.println(obj2.getBalance());
        System.out.println(obj3.getBalance());
    }
}
