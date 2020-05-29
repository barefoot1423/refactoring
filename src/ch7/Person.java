package ch7;

public class Person {
    private String name;

    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAreaCode() {
        return officeTelephone.getAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        officeTelephone.setAreaCode(officeAreaCode);
    }

}
