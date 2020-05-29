package ch7;

public class Person {

    private String name;

    public TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(TelephoneNumber officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getOfficeAreaCode() {
        return officeTelephone.getAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        officeTelephone.setAreaCode(officeAreaCode);
    }

    String getNumber() {
        return officeTelephone.getOfficeNumber();
    }

    void setNumber(String number) {
        officeTelephone.setOfficeNumber(number);
    }

}
