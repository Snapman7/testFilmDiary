package ru.snapman.films.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.snapman.films.model.Film;
import ru.snapman.films.service.FilmsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FilmsController {


    private final FilmsService filmsService;

    @GetMapping("/")
    public List<Film> getAllFilms() {
        return filmsService.getAllFilms();
    }

    @GetMapping("/favorites")
    public List<Film> getFavorite() {
        return filmsService.getFavorite();
    }

    @GetMapping("/favorites/series")
    public List<Film> getFavoriteSeries() {
        return filmsService.getFavoriteSeries();
    }

    @GetMapping("/favorites/films")
    public List<Film> getFavoriteFilms() {
        return filmsService.getFavoriteFilms();
    }

    @PostMapping("/")
    public void addFilm(@RequestBody Film newFilm) {
        filmsService.addFilm(newFilm);
    }

    @GetMapping("/find")
    public List<Film> findFilmsByName(@RequestParam(name = "name") String name) {
        return filmsService.findByName(name);
    }

    @GetMapping("/series")
    public List<Film> findSeries() {
        return filmsService.findSeries();
    }

    @GetMapping("/films")
    public List<Film> findFilms() {
        return filmsService.findFilms();
    }

    @GetMapping("/delete/{id}")
    public boolean deleteFilm(@PathVariable Long id) {
        return filmsService.deleteFilm(id);
    }
}
