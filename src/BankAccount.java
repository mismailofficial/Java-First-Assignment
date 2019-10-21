public class BankAccount {

    // Instance Variable
    private int accNo;
    private String name;
    private float balance;

    // Counter Variable
    static int count = 0;
    static {
        count++;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    // Constructor Overloading
    BankAccount(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
    }
    BankAccount(int accNo, String name, float balance) {
        this(accNo, name);
        this.balance = balance;
    }
    BankAccount () {}

    // Methods
    void deposit(float balance) {
        this.balance += balance;
    }
    void withdraw(int w) {
        if (w > balance)
            System.out.println("Insufficient Ballance");
        else
            balance -= w;
    }
    void checkBalance() {
        System.out.println(balance);
    }
}
