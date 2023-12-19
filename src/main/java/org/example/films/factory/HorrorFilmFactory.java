package org.example.films.factory;

import org.example.films.Film;
import org.example.films.HorrorFilm;
import org.example.films.abstractfactory.FilmAbstractFactory;

public class HorrorFilmFactory implements FilmAbstractFactory {
    @Override
    public Film createFilm(String name, String rating, String releaseDate) {
        return new HorrorFilm(name, rating, releaseDate);
    }
}
