public class BankAccount {
    private static String bankName;
    private String accountNumber;
    private double balance;

    public static void setBankName(String name) {
        bankName = name;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Fondi Insufficenti");
        }
    }

    public void getAccountInfo() {
        System.out.println("Numero Account: " + accountNumber);
        System.out.println("Bilancio: $" + balance);
        System.out.println("Nome Banca: " + bankName);
    }
}
