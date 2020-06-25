package ch8;

public class Customer {

    private final String name;

    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Customer create(String name) {
        return new Customer(name);
    }

}
