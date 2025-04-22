package work_04_03_2025;

public class BankAccount {
    double balance;
    static int accountCounter;

    public BankAccount(double newBalance){
        balance = newBalance;
        accountCounter++;
    }

    public void deposit (double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance = balance - amount;
        } else {
            System.out.println("Сумма списания превышает баланс на счету");
        }
    }

    public void printAccountInfo(){
        System.out.println("Баланс: " + balance);
        System.out.println("Кол-во аккаунтов: " + accountCounter);
    }

}
