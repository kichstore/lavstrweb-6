package org.example.films.abstractfactory;

import org.example.films.Film;

public interface FilmAbstractFactory {
    Film createFilm(String name, String rating, String releaseDate);
}
