package com.movies.infrastructure.controller;

import com.movies.domain.models.Movie;
import com.movies.domain.ports.in.GetAllMoviesUseCase;
import com.movies.domain.ports.in.GetFilterMoviesUseCase;
import com.movies.domain.ports.in.GetMovieUseCase;
import com.movies.domain.ports.in.SaveMovieUseCase;
import com.movies.infrastructure.Dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MovieController {

    private final SaveMovieUseCase saveMovieUseCase;
    private final GetMovieUseCase getMovieUseCase;
    private final GetAllMoviesUseCase getAllMoviesUseCase;
    private final GetFilterMoviesUseCase filterMoviesUseCase;

    @PostMapping
    public ResponseDto saveMovie(@RequestBody Movie movie){
        return ResponseDto.builder()
                .data(saveMovieUseCase.saveMovie(movie))
                .message("Respuesta Ok")
                .status(200)
                .build();
    }

    @GetMapping("/{id}")
    public ResponseDto getMovie(@PathVariable Long id){
        Optional<Movie> movieOptional =  getMovieUseCase.getMovieById(id);
        if(movieOptional.isPresent())
            return ResponseDto.builder()
                .data(movieOptional.get())
                .message("Respuesta Ok")
                .status(200)
                .build();
        return ResponseDto.builder()
                .message("No encontrado")
                .status(404)
                .build();
    }

    @GetMapping
    public ResponseEntity<ResponseDto> getAllMovie(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ){
        Pageable paging = PageRequest.of(page, size);
           return new ResponseEntity<>(ResponseDto.builder()
                    .data(getAllMoviesUseCase.getAllMovies(paging))
                    .message("Respuesta Ok")
                    .status(200)
                    .build(), HttpStatus.OK);


    }

    @GetMapping("/filter")
    public ResponseEntity<ResponseDto> getFilterMovie(
            @RequestParam int score,
            @RequestParam int duration
    ){

        return new ResponseEntity<>(ResponseDto.builder()
                .data(filterMoviesUseCase.getFilterMovies(duration,score))
                .message("Respuesta Ok")
                .status(200)
                .build(), HttpStatus.OK);


    }

}
