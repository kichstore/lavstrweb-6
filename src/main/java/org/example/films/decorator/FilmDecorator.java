package org.example.films.decorator;

import org.example.films.Film;

public class FilmDecorator extends Film {
    FilmDecorator decoratedFilm;

    public FilmDecorator(Film decorated) {
        this.decoratedFilm = decoratedFilm;
    }

    @Override
    public String getDescription() {
        return decoratedFilm.getDescription();
    }
}