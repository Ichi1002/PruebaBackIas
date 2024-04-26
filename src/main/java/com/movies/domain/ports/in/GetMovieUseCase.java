package com.movies.domain.ports.in;

import com.movies.domain.models.Movie;

import java.util.Optional;

public interface GetMovieUseCase {
    Optional<Movie> getMovieById(Long id);
}
