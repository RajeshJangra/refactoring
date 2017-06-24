package org.refactor.entity.price;

import org.refactor.entity.Movie;

public class RegularMoviePrice implements Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(final int daysRented) {
        return daysRented > 3 ? 2 + (daysRented - 2) * 1.5 : 2;
    }
}
