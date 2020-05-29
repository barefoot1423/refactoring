package ch7;

import java.util.Date;

class Report {

    Date previousEnd = new Date();

    void sendReport() {
        Date nextDay = new Date(previousEnd.getYear(),previousEnd.getMonth(), previousEnd.getDate() + 1);
    }

}
