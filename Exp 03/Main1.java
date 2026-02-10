class BankAccount {
    double balance = 500;
    void deposit(double amt) {
    balance += amt;
}
    void withdraw(double amt) {
    balance -= amt;
}
}
class SavingsAccount extends BankAccount {
    void withdraw(double amt) {
    if (balance - amt < 100)
    System.out.println("Min 100 balance needed");
    else
    balance -= amt;
}
}
public class Main1 {
    public static void main(String[] args) {
    SavingsAccount s = new SavingsAccount();
    s.withdraw(450);
    System.out.println("Balance: " + s.balance);
}
}