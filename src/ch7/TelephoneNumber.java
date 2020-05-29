package ch7;

public class TelephoneNumber {
    private String areaCode;
    private String number;

    String getAreaCode() {
        return areaCode;
    }

    void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    String getOfficeNumber() {
        return "(" + areaCode + ") " + number;
    }

    void setOfficeNumber(String number) {
        this.number = number;
    }

}
