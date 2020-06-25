package ch8;

public class Order {

    private Customer customer;

    public Order(String customerName) {
        customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
