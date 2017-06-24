package org.refactor.entity.price;

import org.refactor.entity.Movie;

public class RegularMoviePrice extends Price {
    public int getPrice() {
        return Movie.REGULAR;
    }
}
