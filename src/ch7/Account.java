package ch7;

public class Account {
    private AccountType type;
    private int daysOverdrawn;

    double backCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += type.overdraftCharge(daysOverdrawn);
        }

        return result;
    }

}
