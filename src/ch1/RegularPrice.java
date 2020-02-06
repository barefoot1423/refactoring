package ch1;

import org.omg.CORBA.PRIVATE_MEMBER;

public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

}
