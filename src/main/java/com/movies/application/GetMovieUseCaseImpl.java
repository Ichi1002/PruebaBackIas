package com.movies.application;

import com.movies.domain.models.Movie;
import com.movies.domain.ports.in.GetMovieUseCase;
import com.movies.domain.ports.out.MoviesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetMovieUseCaseImpl implements GetMovieUseCase {

    private final MoviesRepo moviesRepo;
    @Override
    public Optional<Movie> getMovieById(Long id) {
        return moviesRepo.getMovie(id);
    }
}
