package com.movies.application;

import com.movies.domain.models.Movie;
import com.movies.domain.ports.in.GetAllMoviesUseCase;
import com.movies.domain.ports.out.MoviesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllMoviesUseCaseImpl implements GetAllMoviesUseCase {

    private final MoviesRepo getAllMoviesRepo;
    @Override
    public Page<Movie> getAllMovies(Pageable pageable) {
        return getAllMoviesRepo.getAllMovies(pageable);
    }
}
