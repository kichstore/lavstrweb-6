package org.example.films.factory;

import org.example.films.DetectiveFilm;
import org.example.films.Film;
import org.example.films.abstractfactory.FilmAbstractFactory;

public class DetectiveFilmFactory implements FilmAbstractFactory {
    @Override
    public Film createFilm(String name, String rating, String releaseDate) {
        return new DetectiveFilm(name, rating, releaseDate);
    }
}
