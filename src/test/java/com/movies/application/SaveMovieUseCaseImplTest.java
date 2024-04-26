package com.movies.application;

import com.movies.domain.models.Movie;
import com.movies.domain.ports.out.MoviesRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SaveMovieUseCaseImplTest {
    @Mock
    private MoviesRepo moviesRepo;

    @InjectMocks
    private SaveMovieUseCaseImpl saveMovieUseCase;
    @Test
    void saveMovie() {
        when(moviesRepo.saveMovie(any(Movie.class))).thenReturn(any(Movie.class));
        assertNotNull(saveMovieUseCase.saveMovie(any(Movie.class)));
    }
}