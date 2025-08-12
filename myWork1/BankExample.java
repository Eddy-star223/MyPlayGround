import java.util.HashMap;
import java.util.Scanner;

class Account {
    String firstName;
    String lastName;
    int pin;
    double balance;

    // Constructor
    public Account(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.balance = 0.0;
    }

    // Deposit Money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: $" + balance);
    }

    // Withdraw Money
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin == pin) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful! New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Incorrect PIN. Transaction failed.");
        }
    }

    // Check Balance
    public void checkBalance(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Your balance: $" + balance);
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }

    // Change PIN
    public void changePin(int oldPin, int newPin) {
        if (oldPin == pin) {
            pin = newPin;
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Incorrect old PIN. PIN change failed.");
        }
    }
}

class Bank {
    HashMap<String, Account> accounts = new HashMap<>();

    // Create Account
    public void createAccount(String firstName, String lastName, int pin) {
        String accountNumber = firstName.toLowerCase() + lastName.toLowerCase();
        accounts.put(accountNumber, new Account(firstName, lastName, pin));
        System.out.println("Account created successfully for " + firstName + " " + lastName);
    }

    // Transfer Money
    public void transfer(String senderName, String receiverName, double amount, int senderPin) {
        Account sender = accounts.get(senderName.toLowerCase());
        Account receiver = accounts.get(receiverName.toLowerCase());

        if (sender != null && receiver != null) {
            if (sender.pin == senderPin) {
                if (amount <= sender.balance) {
                    sender.balance -= amount;
                    receiver.balance += amount;
                    System.out.println("Transfer successful!");
                } else {
                    System.out.println("Insufficient funds for transfer.");
                }
            } else {
                System.out.println("Incorrect PIN. Transfer failed.");
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    // Close Account
    public void closeAccount(String accountName) {
        if (accounts.containsKey(accountName.toLowerCase())) {
            accounts.remove(accountName.toLowerCase());
            System.out.println("Account closed successfully!");
        } else {
            System.out.println("Account not found.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to the Bank App!");
        
        // Example Flow
        bank.createAccount("John", "Doe", 1234);
        bank.createAccount("Alice", "Smith", 5678);

        Account john = bank.accounts.get("johndoe");
        Account alice = bank.accounts.get("alicesmith");

        john.deposit(500);
        john.withdraw(200, 1234);
        john.checkBalance(1234);

        bank.transfer("John", "Alice", 100, 1234);
        alice.checkBalance(5678);
    }
}





/*  
class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    // Create Account
    public void createAccount(String firstName, String lastName, int pin) {
        Account newAccount = new Account(firstName, lastName, pin);
        accounts.add(newAccount);
        System.out.println("Account created successfully for " + firstName + " " + lastName);
    }

    // Find Account by Name
    public Account findAccount(String firstName, String lastName) {
        for (Account acc : accounts) {
            if (acc.firstName.equalsIgnoreCase(firstName) && acc.lastName.equalsIgnoreCase(lastName)) {
                return acc;
            }
        }
        return null;
    }

    // Transfer Money
    public void transfer(String senderFirstName, String senderLastName, String receiverFirstName, String receiverLastName, double amount, int senderPin) {
        Account sender = findAccount(senderFirstName, senderLastName);
        Account receiver = findAccount(receiverFirstName, receiverLastName);

        if (sender != null && receiver != null) {
            if (sender.pin == senderPin) {
                if (amount <= sender.balance) {
                    sender.balance -= amount;
                    receiver.balance += amount;
                    System.out.println("Transfer successful!");
                } else {
                    System.out.println("Insufficient funds for transfer.");
                }
            } else {
                System.out.println("Incorrect PIN. Transfer failed.");
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    // Close Account
    public void closeAccount(String firstName, String lastName) {
        Account acc = findAccount(firstName, lastName);
        if (acc != null) {
            accounts.remove(acc);
            System.out.println("Account closed successfully!");
        } else {
            System.out.println("Account not found.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to the Bank App!");
        
        // Example Flow
        bank.createAccount("John", "Doe", 1234);
        bank.createAccount("Alice", "Smith", 5678);

        Account john = bank.findAccount("John", "Doe");
        Account alice = bank.findAccount("Alice", "Smith");

        john.deposit(500);
        john.withdraw(200, 1234);
        john.checkBalance(1234);

        bank.transfer("John", "Doe", "Alice", "Smith", 100, 1234);
        alice.checkBalance(5678);
    }
}


*/






