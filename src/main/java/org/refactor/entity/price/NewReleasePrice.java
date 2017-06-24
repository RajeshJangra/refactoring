package org.refactor.entity.price;

import org.refactor.entity.Movie;

public class NewReleasePrice extends Price {
    public int getPrice() {
        return Movie.NEW_RELEASE;
    }
}
