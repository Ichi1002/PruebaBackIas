package com.movies.infrastructure.adapters;

import com.movies.domain.models.Movie;
import com.movies.domain.ports.out.MoviesRepo;
import com.movies.infrastructure.Entities.MovieEntity;
import com.movies.infrastructure.repository.JpaMovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class JpaMovieAdapter implements MoviesRepo {
     private final JpaMovieRepository jpaMovieRepository;

    @Override
    public Page<Movie> getAllMovies(Pageable paging) {
       return jpaMovieRepository.findAll(paging).map(MovieEntity::toDomain);
    }

    @Override
    public List<Movie> getFilterMovies(int duration, int score) {
        return jpaMovieRepository.findByDurationAndScore(duration,score)
                .stream()
                .map(MovieEntity::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Movie> getMovie(Long id) {
        return jpaMovieRepository.findById(id).map(MovieEntity::toDomain);

    }

    @Override
    public Movie saveMovie(Movie movie) {
        return jpaMovieRepository.save(MovieEntity.fromDomain(movie)).toDomain();
    }
}
