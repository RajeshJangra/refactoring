package org.refactor.entity.price;

import org.refactor.entity.Movie;

public abstract class Price {
    public abstract int getPrice();

    public double getCharge(final int daysRented) {
        double result = 0;
        switch (getPrice()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }
}
