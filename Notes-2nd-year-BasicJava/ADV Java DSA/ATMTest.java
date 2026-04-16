class BankAccount {

    private int balance; // 🔐 private (encapsulation)

    // Constructor
    BankAccount(int balance) {
        this.balance = balance;
    }

    // Instance method (uses object data)
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method Overloading
    public void deposit(int amount, String note) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Note: " + note);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public int checkBalance() {
        return balance;
    }

    // Private method (cannot be overridden)
    private void secretLog() {
        System.out.println("Logging transaction...");
    }

    public void performSecretLog() {
        secretLog(); // accessed internally
    }
}

// 🔥 Inheritance + Overriding
class PremiumAccount extends BankAccount {

    PremiumAccount(int balance) {
        super(balance);
    }

    // Method overriding
    @Override
    public void withdraw(int amount) {
        System.out.println("Premium Account Withdrawal");

        // extra benefit
        super.withdraw(amount + 10); // discount
    }
}

public class ATMTest {

    // 🔥 Static method (class level)
    public static void displayMenu() {
        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }



    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);
        PremiumAccount pAcc = new PremiumAccount(2000);

        displayMenu(); // static call

        acc.deposit(500); // normal method
        pAcc.deposit(200, "Gift"); // overloaded method

        pAcc.withdraw(300);

        System.out.println("Balance: " + pAcc.checkBalance());

        acc.performSecretLog(); // private method indirectly

        // 🔥 Overriding demo
        BankAccount ref = new PremiumAccount(3000);
        ref.withdraw(500); // calls PremiumAccount version

        // 🔥 Call by value demo
        int a = 10;
        System.out.println("Value of a: " + a); // still 10
    }
}