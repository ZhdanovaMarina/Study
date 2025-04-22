package work_16_04_25;

import java.util.List;

public class Transaction {

    private double sum;
    private String type; // доход/расход
    private String date;

    public Transaction(double sum, String type, String date) {
        this.sum = sum;
        this.type = type;
        this.date = date;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
