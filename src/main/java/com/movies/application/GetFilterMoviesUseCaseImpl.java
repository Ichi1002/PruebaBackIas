package com.movies.application;

import com.movies.domain.models.Movie;
import com.movies.domain.ports.in.GetFilterMoviesUseCase;
import com.movies.domain.ports.out.MoviesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetFilterMoviesUseCaseImpl implements GetFilterMoviesUseCase {
    private final MoviesRepo moviesRepo;
    @Override
    public List<Movie> getFilterMovies(int duration, int score) {
        return moviesRepo.getFilterMovies(duration,score);
    }
}
