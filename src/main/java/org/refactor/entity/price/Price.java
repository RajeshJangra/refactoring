package org.refactor.entity.price;

public interface Price {

    int getPriceCode();

    double getCharge(final int daysRented);
}
