import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);

    double funds = 25;
    String newFunds;

    public double deposit() {
        System.out.println("Qual o valor que o senhor(a) deseja depositar?");
        double deposit = scanner.nextDouble();
        funds += deposit;
        validationFunds();
        return funds;
    }

    public double withdraw() {
        System.out.println("Qual valor o senhor(a) deseja sacar?");
        double withdraw = scanner.nextDouble();
        funds -= withdraw;
        validationFunds();
        return funds;
    }

    private void validationFunds() {
        newFunds = (funds < 0) ? "Sua conta foi bloqueada, por favor entre em contato conosco." : Double.toString(funds);
    }

    public void printFunds() {
        System.out.println(newFunds);
    }
}
