package work_09_04_2025.hw.task_2;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        if (balance < money) {
            System.out.println("Ошибка, недостаточно средств");
        }
        balance -= money;
    }

    public void printAccount(){
        System.out.println(balance);
    }
}
