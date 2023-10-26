package oop.designPatterns;

public class LoDvsPolymorphism {

    // Law of Demeter (LoD) Approach
    class Bank {
        private Account account;

        public Bank(Account account) {
            this.account = account;
        }

        public void showBalance() {
            System.out.println("Bank account balance: " + account.getBalance());
        }
    }

    class Account {
        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }
    }

    // Polymorphism Approach
    interface PaymentProcessor {
        void processPayment(double amount);
    }

    class CreditCardProcessor implements PaymentProcessor {
        public void processPayment(double amount) {
            System.out.println("Processing credit card payment: $" + amount);
        }
    }

    class PayPalProcessor implements PaymentProcessor {
        public void processPayment(double amount) {
            System.out.println("Processing PayPal payment: $" + amount);
        }
    }

    class PaymentGateway {
        private PaymentProcessor processor;

        public PaymentGateway(PaymentProcessor processor) {
            this.processor = processor;
        }

        public void makePayment(double amount) {
            processor.processPayment(amount);
        }
    }

    public static void main(String[] args) {
        LoDvsPolymorphism example = new LoDvsPolymorphism();

        // Using LoD
        Account myAccount = example.new Account(1000.0);
        Bank myBank = example.new Bank(myAccount);
        myBank.showBalance();

        // Using Polymorphism
        PaymentProcessor cardProcessor = example.new CreditCardProcessor();
        PaymentGateway gateway = example.new PaymentGateway(cardProcessor);
        gateway.makePayment(100.0);
    }

    /* Comments

    LoD Approach:
    The Bank class interacts directly with the Account class, adhering to the Law of Demeter.
    It only talks to its 'friends' (i.e., directly associated classes) and doesn't navigate through multiple objects.
    This minimizes coupling and makes the system easier to maintain.

    Polymorphism Approach:
    PaymentGateway class is not concerned with the specific type of PaymentProcessor.
    It's programmed to an interface, not a concrete class, allowing different payment methods without altering the PaymentGateway class.


Code Breakdown
Law of Demeter (LoD) Approach
Bank Class: This class has a direct association with the Account class.
 It uses this association to call the getBalance method of Account.

Account Class: Holds a balance field and exposes it through a getBalance method.
The Bank class interacts with Account without going through other objects, adhering to the Law of Demeter.

Polymorphism Approach
Interface PaymentProcessor: This interface declares a processPayment method that different payment processors must implement.

CreditCardProcessor & PayPalProcessor Classes:
 These implement the PaymentProcessor interface, providing concrete implementations for processing payments.

PaymentGateway Class: This class takes a PaymentProcessor as a dependency and uses it to process payments.
 It does not know or care about which concrete class is doing the processing.

Base4OOP Method
Using LoD: We create an Account object and a Bank object, passing the account to the bank.
Then, we display the balance following the Law of Demeter.

Using Polymorphism: We create a CreditCardProcessor object, pass it to a PaymentGateway, and then make a payment.
The PaymentGateway is not coupled to a specific processor thanks to Polymorphism.

So, in summary, the Law of Demeter is about minimizing the coupling between classes
 by only interacting with closely related classes.
 On the other hand, Polymorphism allows objects to be treated as instances of their parent class,
 making it easier to extend functionalities without modifying existing code.
  Both principles aim to improve the maintainability and flexibility of the code but address different aspects.
    */
}
