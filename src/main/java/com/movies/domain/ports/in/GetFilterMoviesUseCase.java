package com.movies.domain.ports.in;

import com.movies.domain.models.Movie;

import java.util.List;

public interface GetFilterMoviesUseCase {
    List<Movie> getFilterMovies(int duration, int score);
}
