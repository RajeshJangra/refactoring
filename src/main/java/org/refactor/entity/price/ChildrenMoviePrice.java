package org.refactor.entity.price;

import org.refactor.entity.Movie;

public class ChildrenMoviePrice extends Price {
    public int getPrice() {
        return Movie.CHILDRENS;
    }
}
