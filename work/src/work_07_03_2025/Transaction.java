package work_07_03_2025;

public class Transaction {

    private String date;
    private int sum;

    public Transaction(String date, int sum) {
        this.date = date;
        this.sum = sum;
    }

    public String getDate() {
        return date;
    }

    public int getSum() {
        return sum;
    }
}
