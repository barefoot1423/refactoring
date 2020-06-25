package ch8;

import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

    }

    private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;

        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if (each.getCustomerName().equals(customer)) {
                result++;
            }
        }

        return result;
    }
}
