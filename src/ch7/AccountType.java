package ch7;

public class AccountType {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }

            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    boolean isPremium() {
        return true;
    }

}
