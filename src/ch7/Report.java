package ch7;

import java.util.Date;

class Report {

    Date previousEnd = new Date();

    void sendReport() {
        Date newStart = nextDay(previousEnd);
    }

    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }
}
