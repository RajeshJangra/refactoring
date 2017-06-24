package org.refactor.entity;

import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals;

    public String statement() {
        StringBuilder result = new StringBuilder("Rental Record for " + name + "\n");
        double totalAmount = 0;
        for (Rental rental : rentals) {
            //show figures for this rental
            final Movie movie = rental.getMovie();
            result.append("\t").append(movie.getTitle()).append("\t").append(movie.price.getCharge(rental.getDaysRented())).append("\n");
            totalAmount += movie.price.getCharge(rental.getDaysRented());
        }
        //add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n").append("You earned ").append(getFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }

    private int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.getMovie().getFrequentRenterPoints(rental.getDaysRented());
        }
        return frequentRenterPoints;
    }

    public Customer(final String name, final List rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List getRentals() {
        return rentals;
    }

    public void setRentals(final List rentals) {
        this.rentals = rentals;
    }
}
