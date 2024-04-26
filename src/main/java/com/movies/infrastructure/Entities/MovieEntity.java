package com.movies.infrastructure.Entities;


import com.movies.domain.models.Movie;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle; // ( * texto máximo 100 caracteres)
    private String description; // ( texto máximo 200 caracteres)
    private int duration; //  ( * número que represente la duración en minutos)
    private int score; //( * número del 1 al 5 que califica la película)
    //private Long idCategory; //( *)

    public static MovieEntity fromDomain(Movie movie){
        return MovieEntity.builder()
                .id(movie.getId())
                .tittle(movie.getTittle())
                .description(movie.getDescription())
                .duration(movie.getDuration())
                .score(movie.getScore())
                .build();
    }

    public Movie toDomain(){
        return Movie.builder()
                .id(this.id)
                .tittle(this.tittle)
                .description(this.description)
                .duration(this.duration)
                .score(this.score)
                //.category()
                .build();
    }


}
