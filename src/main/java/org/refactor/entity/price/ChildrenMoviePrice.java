package org.refactor.entity.price;

import org.refactor.entity.Movie;

public class ChildrenMoviePrice implements Price {
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(final int daysRented) {
        return daysRented > 3 ? 1.5 + (daysRented - 3) * 1.5 : 1.5;
    }
}
