public class Main {
    public static void main(String[] args) {
        BankAccount.setBankName("BANCA MEDIOLANUM");

        BankAccount account1 = new BankAccount("BBB001", 1000.0);
        BankAccount account2 = new BankAccount("CCC002", 2000.0);

        account1.deposit(500.0);
        account1.withdraw(200.0);

        account2.deposit(1000.0);
        account2.withdraw(2000.0);

        account1.getAccountInfo();
        System.out.println();
        account2.getAccountInfo();
    }
}