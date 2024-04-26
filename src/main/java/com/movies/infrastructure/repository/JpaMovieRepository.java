package com.movies.infrastructure.repository;

import com.movies.infrastructure.Entities.MovieEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface JpaMovieRepository extends PagingAndSortingRepository<MovieEntity,Long>, JpaRepository<MovieEntity,Long> {
    @Override
    Page<MovieEntity> findAll(Pageable pageable);

    List<MovieEntity> findByDurationAndScore(int duration, int score);
}
