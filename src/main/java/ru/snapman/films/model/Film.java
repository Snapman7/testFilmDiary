package ru.snapman.films.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmId;

    private String filmDescription;
    private String filmName;
    private double filmRating;
    private boolean wantToSee;
    private boolean isSeries;
    private Integer episodeCount;
}
