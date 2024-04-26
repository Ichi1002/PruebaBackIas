package com.movies.application;

import com.movies.domain.ports.out.MoviesRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class GetMovieUseCaseImplTest {

    @Mock
    private MoviesRepo moviesRepo;

    @InjectMocks
    private GetMovieUseCaseImpl getMovieUseCase;

    @Test
    void should_return_a_movie() {
        //when(getMovieUseCase.getMovieById(any(Long.class))).thenReturn(any(Movie.class));
        assertNotNull(getMovieUseCase.getMovieById(any(Long.class)));
    }
}