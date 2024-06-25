package ru.snapman.films.service;

import ru.snapman.films.model.Film;

import java.util.List;

public interface FilmsService {

    List<Film> getAllFilms();

    List<Film> getFavorite();

    List<Film> getFavoriteFilms();

    List<Film> getFavoriteSeries();

    void addFilm(Film newFilm);

    List<Film> findByName(String name);

    List<Film> findSeries();

    List<Film> findFilms();

    boolean deleteFilm(Long id);

}
