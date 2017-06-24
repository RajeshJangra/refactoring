package org.refactor;

import org.refactor.entity.Customer;
import org.refactor.entity.Movie;
import org.refactor.entity.Rental;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Movie salt = new Movie("Salt", 1);
        Movie matrix = new Movie("Matrix", 2);
        Movie thor = new Movie("Thor", 0);

        final List<Rental> rentals = Arrays.asList(
                new Rental(salt, 5),
                new Rental(matrix, 3),
                new Rental(thor, 6));

        Customer customer = new Customer("Rajesh Kumar", rentals);
        System.out.println(customer.statement());
    }
}
