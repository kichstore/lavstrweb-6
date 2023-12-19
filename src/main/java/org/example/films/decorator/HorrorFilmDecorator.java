package org.example.films.decorator;

public class HorrorFilmDecorator extends  FilmDecorator{
    public HorrorFilmDecorator(FilmDecorator decoratedFilm) {
        super(decoratedFilm);
    }

    public String actionInfo(){
        return "\nНе редко бывают и в стиле триллер!";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + actionInfo();
    }
}