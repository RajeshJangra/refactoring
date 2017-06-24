package org.refactor.entity;

import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals;

    public String statement() {
        StringBuilder result = new StringBuilder("Rental Record for " + name + "\n");

        double totalAmount = rentals.stream().mapToDouble(rental -> {
            final Movie movie = rental.getMovie();
            result.append("\t").append(movie.getTitle()).append("\t").append(movie.price.getCharge(rental.getDaysRented())).append("\n");
            return movie.price.getCharge(rental.getDaysRented());
        }).sum();
        //add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n").append("You earned ").append(getFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }

    private int getFrequentRenterPoints() {
        return rentals.parallelStream().mapToInt(rental -> rental.getMovie().getFrequentRenterPoints(rental.getDaysRented())).sum();
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
