package org.example.films.factory;

import org.example.films.ActionFilm;
import org.example.films.Film;
import org.example.films.abstractfactory.FilmAbstractFactory;

public class ActionFilmFactory implements FilmAbstractFactory {
    @Override
    public Film createFilm(String name, String rating, String releaseDate) {
        return new ActionFilm(name, rating, releaseDate);
    }
}
