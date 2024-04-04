public class User {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit();
        bankAccount.printFunds();
        bankAccount.withdraw();
        bankAccount.printFunds();
    }
}
