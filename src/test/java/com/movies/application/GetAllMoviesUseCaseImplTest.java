package com.movies.application;

import com.movies.domain.ports.out.MoviesRepo;
import com.movies.domain.models.Movie;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAllMoviesUseCaseImplTest {

    @Mock
    private MoviesRepo moviesRepo;

    @InjectMocks
    private GetAllMoviesUseCaseImpl getAllMoviesUseCase;

    @Test
    void should_return_a_list_of_movies(){
            //when(getAllMoviesUseCase.getAllMovies()).thenReturn(Arrays.asList(any(Movie.class)));
            //assertNotNull(moviesRepo.getAllMovies());
        }

}
