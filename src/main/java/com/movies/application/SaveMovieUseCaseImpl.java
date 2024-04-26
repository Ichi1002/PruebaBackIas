package com.movies.application;

import com.movies.domain.models.Movie;
import com.movies.domain.ports.in.SaveMovieUseCase;
import com.movies.domain.ports.out.MoviesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveMovieUseCaseImpl implements SaveMovieUseCase {

    private final MoviesRepo moviesRepo;
    @Override
    public Movie saveMovie(Movie movie) {
        return moviesRepo.saveMovie(movie);
    }
}
