package org.refactor.entity;

import org.refactor.entity.price.ChildrenMoviePrice;
import org.refactor.entity.price.NewReleasePrice;
import org.refactor.entity.price.Price;
import org.refactor.entity.price.RegularMoviePrice;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    Price price;

    public Movie(final String title, final int price) {
        this.title = title;
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(final int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularMoviePrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case CHILDRENS:
                price = new ChildrenMoviePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    int getFrequentRenterPoints(final int daysRented) {
        return (price.getPrice() == NEW_RELEASE && daysRented > 1) ? 2 : 1;
    }
}


