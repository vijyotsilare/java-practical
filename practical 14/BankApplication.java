   import java.util.Scanner;

// ----------- Interface 1 -----------
interface BankOperations {

    double MIN_BALANCE = 1000; // public static final

    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();

    default void bankInfo() {
        System.out.println("Welcome to Smart Bank!");
        log();
    }

    static void rules() {
        System.out.println("Follow RBI banking rules.");
    }

    private void log() {
        System.out.println("Transaction logged (private method)");
    }
}

// ----------- Interface 2 (Ambiguity) -----------
interface LoanOperations {

    default void bankInfo() {
        System.out.println("Loan Department Services");
    }
}

// ----------- Abstract Class -----------
abstract class AbstractAccount {

    protected String name;
    protected double balance;

    public AbstractAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    abstract void calculateInterest();

    public void showDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

// ----------- User-defined Exceptions -----------
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}

// ----------- Implementation Class -----------
class Account extends AbstractAccount 
        implements BankOperations, LoanOperations {

    public Account(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            try {
                throw new InvalidAmountException("Invalid deposit amount");
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        try {
            if (amount <= 0)
                throw new InvalidAmountException("Invalid withdraw amount");

            if (balance - amount < MIN_BALANCE)
                throw new InsufficientBalanceException("Minimum balance must be maintained");

            balance -= amount;
            System.out.println("Withdrawn: " + amount);

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest (5%): " + interest);
    }

    // Ambiguity resolution
    @Override
    public void bankInfo() {
        BankOperations.super.bankInfo();
        LoanOperations.super.bankInfo();
        System.out.println("Ambiguity resolved in Account class");
    }
}

// ----------- Main Class -----------
public class BankApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(name, balance);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Details");
            System.out.println("5. Interest");
            System.out.println("6. Bank Info (Ambiguity Demo)");
            System.out.println("7. Rules (Static)");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    acc.showDetails();
                    break;

                case 5:
                    acc.calculateInterest();
                    break;

                case 6:
                    acc.bankInfo();
                    break;

                case 7:
                    BankOperations.rules();
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
} 