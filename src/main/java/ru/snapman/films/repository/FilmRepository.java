package ru.snapman.films.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.snapman.films.model.Film;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findAllByWantToSeeTrue();

    List<Film> findAllByWantToSeeTrueAndIsSeries(boolean isSeries);

    List<Film> findAllByIsSeries(boolean isSeries);

    List<Film> findAllByFilmNameContainingIgnoreCase(String name);
}
