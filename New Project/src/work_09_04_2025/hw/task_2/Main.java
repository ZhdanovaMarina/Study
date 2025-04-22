package work_09_04_2025.hw.task_2;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.deposit(5000);
        account1.printAccount();

//      account1.withdraw(6000);
        account1.withdraw(2000);
        account1.printAccount();
    }
}
