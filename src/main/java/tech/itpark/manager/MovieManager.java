package tech.itpark.manager;


import tech.itpark.domain.Movie;

import java.util.ArrayList;

public class MovieManager {
    private ArrayList<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
    }

}
