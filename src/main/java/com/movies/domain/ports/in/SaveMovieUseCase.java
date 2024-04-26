package com.movies.domain.ports.in;

import com.movies.domain.models.Movie;

public interface SaveMovieUseCase {
    Movie saveMovie(Movie movie);
}
