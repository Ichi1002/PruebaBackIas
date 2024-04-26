package com.movies.domain.ports.out;

import com.movies.domain.models.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface MoviesRepo {
    Page<Movie> getAllMovies(Pageable pageable);

    List<Movie> getFilterMovies(int duration, int score);

    Optional<Movie> getMovie(Long id);
    Movie saveMovie(Movie movie);
}
