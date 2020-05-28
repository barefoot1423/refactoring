package ch7;

public class Account {
    private AccountType type;
    private int daysOverdrawn;
    private double interestRate;

    double backCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += type.overdraftCharge(daysOverdrawn);
        }

        return result;
    }

    double interestForAmount_days(double amount, int days) {
        return interestRate * amount * days / 365;
    }

}
