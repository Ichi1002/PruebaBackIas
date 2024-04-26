package com.movies.domain.ports.in;

import com.movies.domain.models.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GetAllMoviesUseCase {
    Page<Movie> getAllMovies(Pageable pageable);
}
