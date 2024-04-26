package com.movies.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {

    private Long id;
    private String tittle; // ( * texto máximo 100 caracteres)
    private String description; // ( texto máximo 200 caracteres)
    private int duration; //  ( * número que represente la duración en minutos)
    private int score; //( * número del 1 al 5 que califica la película)

    //private Category category; //( *)

}
