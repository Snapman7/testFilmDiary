package ru.snapman.films.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.snapman.films.model.Film;
import ru.snapman.films.repository.FilmRepository;
import ru.snapman.films.service.FilmsService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmsServicePostgresImpl implements FilmsService {

    private final FilmRepository filmRepository;

    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public List<Film> getFavorite() {
        return filmRepository.findAllByWantToSeeTrue();
    }

    @Override
    public List<Film> getFavoriteFilms() {
        return filmRepository.findAllByWantToSeeTrueAndIsSeries(false);
    }

    @Override
    public List<Film> getFavoriteSeries() {
        return filmRepository.findAllByWantToSeeTrueAndIsSeries(true);
    }

    @Override
    public void addFilm(Film newFilm) {
        filmRepository.save(newFilm);
    }

    @Override
    public List<Film> findByName(String name) {
        return filmRepository.findAllByFilmNameContainingIgnoreCase(name);
    }

    @Override
    public List<Film> findSeries() {
        return filmRepository.findAllByIsSeries(true);
    }

    @Override
    public List<Film> findFilms() {
        return filmRepository.findAllByIsSeries(false);
    }

    @Override
    public boolean deleteFilm(Long id) {
        if (filmRepository.existsById(id)) {
            filmRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
