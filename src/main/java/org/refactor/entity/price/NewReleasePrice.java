package org.refactor.entity.price;

import org.refactor.entity.Movie;

public class NewReleasePrice implements Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(final int daysRented) {
        return daysRented * 3;
    }
}
