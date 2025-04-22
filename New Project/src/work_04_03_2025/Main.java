package work_04_03_2025;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount(0);
        BankAccount bankAccount2 = new BankAccount(100);


        bankAccount1.deposit(50);
        bankAccount2.withdraw(150);
        bankAccount1.printAccountInfo();
        bankAccount2.printAccountInfo();

    }


}
